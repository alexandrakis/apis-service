package com.paymentcomponents.server.service

import com.paymentcomponents.server.domain.NameEnquiryRequest
import com.paymentcomponents.server.domain.NameEnquiryResponse
import com.paymentcomponents.server.utils.CommonUtils
import org.springframework.stereotype.Service

/**
 * Created by apolichronopoulos on 19/04/2017.
 */

@Service
class NameEnquiryService {

    public def getNameEnquiry(NameEnquiryRequest request) {
        def response = new NameEnquiryResponse(CommonUtils.getBindProperties(request))
        return response
    }

}
