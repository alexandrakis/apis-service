package com.paymentcomponents.server.domain

/**
 * Created by a.polichronopoulos on 20-04-2017.
 */

class NameEnquiryRequest {
    String requestId // "000001100913103301000000000001",
    String creationDateTime // "2017-04-19T08:10:01",
    String instructingAgentBIC // "000001",
    String instructedAgentBIC // "000002",
    String channelCode // "1",
    String targetAccountNumber // "2222000000012345"
}

class BalanceEnquiryRequest {
}
