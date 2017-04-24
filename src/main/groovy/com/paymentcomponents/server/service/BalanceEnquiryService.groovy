package com.paymentcomponents.server.service

import com.paymentcomponents.common.models.response.api.BalanceEnquiryResponse
import com.paymentcomponents.common.request.api.BalanceEnquiryRequest
import com.paymentcomponents.server.utils.CommonUtils
import org.springframework.stereotype.Service

/**
 * Created by apolichronopoulos on 19/04/2017.
 */

@Service
class BalanceEnquiryService {

    public def getBalanceEnquiry(BalanceEnquiryRequest request) throws Exception {
        def response = new BalanceEnquiryResponse(CommonUtils.getBindProperties(request))
        response.availableBalance = 999.99
        response.responseCode = "00"
        return response
    }

}
