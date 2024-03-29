package com.paymentcomponents.apis.service.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.paymentcomponents.apis.service.ERROR_CODES
import com.paymentcomponents.apis.service.exceptions.WaspApiValidationException
import com.paymentcomponents.common.log.RequestLogger
import com.paymentcomponents.common.response.Error
import org.springframework.dao.DataIntegrityViolationException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.client.HttpClientErrorException

import javax.servlet.http.HttpServletRequest
import java.sql.SQLException

/**
 * Created by aalexandrakis on 25/04/2017.
 */
@ControllerAdvice
class ExceptionController {
    RequestLogger logger = new RequestLogger(this.class.name)

    @ExceptionHandler(SQLException.class)
    public def sqlErrorHandler(HttpServletRequest req, SQLException e) {
        logger.error("Failed SQL Action", req)
        ObjectMapper objectMapper = new ObjectMapper()
        Error error = new Error(ERROR_CODES.internal_error.toString(), e.getMessage())
        return new ResponseEntity<String>(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(error), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public def postgresErrorHandler(HttpServletRequest req, DataIntegrityViolationException e) {
        logger.error("Failed SQL Action", req)
        ObjectMapper objectMapper = new ObjectMapper()
        Error error = new Error(ERROR_CODES.internal_error.toString(), e.getMessage())
        return new ResponseEntity<String>(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(error), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpClientErrorException.class)
    public def httpErrorHandler(HttpServletRequest req, HttpClientErrorException e) {
        logger.error("Failed Request", req, null, null, e)
        ObjectMapper objectMapper = new ObjectMapper()
        Error error
        try {
            error = objectMapper.readValue(e.getResponseBodyAsString(), Error.class)
        } catch (Exception ex) {
            error = new Error(ERROR_CODES.internal_error.toString(), e.getMessage())
        }
        return new ResponseEntity<String>(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(error), e.statusCode);
    }

    @ExceptionHandler(WaspApiValidationException.class)
    public def waspValidationErrorHandler(HttpServletRequest req, WaspApiValidationException e) {
        logger.error("Failed Request", req, null, null, e)
        ObjectMapper objectMapper = new ObjectMapper()
        return new ResponseEntity<String>(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(new Error(e.errorCode, e.errorDescription)), HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(Exception.class)
    public def genericErrorHandler(HttpServletRequest req, Exception e) {
        logger.error("Failed Request", req, null, null, e)
        Error error = new Error(ERROR_CODES.internal_error.toString(), e.getMessage())
        return new ResponseEntity<String>(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(error), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}