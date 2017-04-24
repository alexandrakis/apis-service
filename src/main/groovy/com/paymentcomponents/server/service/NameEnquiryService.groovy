package com.paymentcomponents.server.service

import com.paymentcomponents.common.models.response.api.NameEnquiryResponse
import com.paymentcomponents.common.request.api.NameEnquiryRequest
import com.paymentcomponents.server.utils.CommonUtils
import org.springframework.stereotype.Service

/**
 * Created by apolichronopoulos on 19/04/2017.
 */

@Service
class NameEnquiryService {

    public def getNameEnquiry(NameEnquiryRequest request) throws Exception {
        def response = new NameEnquiryResponse(CommonUtils.getBindProperties(request))
        response.accountName = "Ajibade Oluwasegun"
        response.bankVerificationNumber = "1033000441"
        response.kycLevel = "1"
        response.responseCode = "00"
        return response
    }

}
