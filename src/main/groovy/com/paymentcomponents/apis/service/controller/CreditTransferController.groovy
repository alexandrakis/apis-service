package com.paymentcomponents.apis.service.controller

import com.paymentcomponents.apis.service.service.CreditTransferService
import com.paymentcomponents.common.log.RequestLogger
import com.paymentcomponents.common.request.CreditTransferRequest
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
class CreditTransferController {

    final protected RequestLogger logger = new RequestLogger(getClass().getName())

    @Autowired
    CreditTransferService creditTransferService

    @RequestMapping(value = "/v1/credit/transfer", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    @ApiOperation(value = "saveCreditTransfer", notes = "Initiate credit transfer.")
    @ApiResponses([
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class)
    ])
    public @ResponseBody
    void saveCreditTransfer(@RequestBody CreditTransferRequest request, HttpServletRequest httpServletRequest) {
        logger.info("Credit Transfer Request", httpServletRequest, request)
        creditTransferService.creditTransfer(request)
    }

}
