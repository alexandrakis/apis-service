package com.paymentcomponents.server.controller

import com.paymentcomponents.common.models.response.api.BalanceEnquiryResponse
import com.paymentcomponents.common.request.api.BalanceEnquiryRequest
import com.paymentcomponents.server.service.BalanceEnquiryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * Created by apolichronopoulos on 19/04/2017.
 */

@RestController
@RequestMapping("/balance/enquiry")
class BalanceEnquiryController extends AbstractApiController {

    @Autowired
    BalanceEnquiryService balanceEnquiryService

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    BalanceEnquiryResponse balanceEnquiry(@RequestBody BalanceEnquiryRequest request) {
        balanceEnquiryService.getBalanceEnquiry(request)
    }

}
