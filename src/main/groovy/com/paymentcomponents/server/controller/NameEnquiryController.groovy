package com.paymentcomponents.server.controller

import com.paymentcomponents.server.domain.NameEnquiryRequest
import com.paymentcomponents.server.domain.NameEnquiryResponse
import com.paymentcomponents.server.service.NameEnquiryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate

/**
 * Created by apolichronopoulos on 19/04/2017.
 */

@RestController
@RequestMapping("/name/enquiry")
class NameEnquiryController extends AbstractApiController {

    private final RestTemplate restTemplate

    @Autowired
    NameEnquiryService nameEnquiryService

    @Autowired
    NameEnquiryController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    NameEnquiryResponse nameEnquiry(@RequestBody NameEnquiryRequest request) {
        nameEnquiryService.getNameEnquiry(request)
    }

}
