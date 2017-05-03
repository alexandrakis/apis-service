package com.paymentcomponents.apis.service.controller

import com.paymentcomponents.apis.service.service.DirectDebitService
import com.paymentcomponents.common.log.RequestLogger
import com.paymentcomponents.common.request.DirectDebitRequest
import com.paymentcomponents.common.response.Error
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

import javax.servlet.http.HttpServletRequest

/**
 * Created by apolichronopoulos on 19/04/2017.
 */

@RestController
class DirectDebitController {

    final protected RequestLogger logger = new RequestLogger(getClass().getName())

    @Autowired
    DirectDebitService directDebitService

    @RequestMapping(value = "/v1/direct/debit", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    @ApiOperation(value = "saveDirectDebit", notes = "Initiate direct debit.")
    @ApiResponses([
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class)
    ])
    public @ResponseBody
    void saveDirectDebit(@RequestBody DirectDebitRequest request, HttpServletRequest httpServletRequest) {
        logger.info("Direct Debit Request", httpServletRequest, request)
        directDebitService.directDebit(request)
    }

}
