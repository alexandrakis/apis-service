package com.paymentcomponents.server.controller

import com.paymentcomponents.common.models.response.api.NameEnquiryResponse
import com.paymentcomponents.common.request.api.NameEnquiryRequest
import com.paymentcomponents.server.service.NameEnquiryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * Created by apolichronopoulos on 19/04/2017.
 */

@RestController
@RequestMapping("/name/enquiry")
class NameEnquiryController {

    @Autowired
    NameEnquiryService nameEnquiryService

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    NameEnquiryResponse nameEnquiry(@RequestBody NameEnquiryRequest request) {
        nameEnquiryService.getNameEnquiry(request)
    }

}
