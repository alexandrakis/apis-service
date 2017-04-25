package com.paymentcomponents.server.controller

import com.paymentcomponents.common.log.RequestLogger
import com.paymentcomponents.common.models.response.api.CreditTransferResponse
import com.paymentcomponents.common.request.api.CreditTransferRequest
import com.paymentcomponents.server.service.CreditTransferService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * Created by apolichronopoulos on 19/04/2017.
 */

@RestController
@RequestMapping("/v1/credit/transfer")
class CreditTransferController {

    final protected RequestLogger logger = new RequestLogger(getClass().getName())

    @Autowired
    CreditTransferService creditTransferService

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    CreditTransferResponse balanceEnquiry(@RequestBody CreditTransferRequest request) {
        creditTransferService.creditTransfer(request)
    }

}
