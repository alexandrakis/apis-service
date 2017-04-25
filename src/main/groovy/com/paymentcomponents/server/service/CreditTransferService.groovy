package com.paymentcomponents.server.service

import com.paymentcomponents.common.models.response.api.CreditTransferResponse
import com.paymentcomponents.common.request.api.CreditTransferRequest
import org.springframework.stereotype.Service

/**
 * Created by apolichronopoulos on 19/04/2017.
 */

@Service
class CreditTransferService {

    public static CreditTransferResponse creditTransfer(CreditTransferRequest request) throws Exception {
        CreditTransferResponse creditTransferResponse = new CreditTransferResponse()
        creditTransferResponse.creditTransferRequest = request
        creditTransferResponse.responseCode = "00"
        creditTransferResponse.waspId = UUID.randomUUID().toString()
        creditTransferResponse
    }

}
