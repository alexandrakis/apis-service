package com.paymentcomponents.server.domain

/**
 * Created by a.polichronopoulos on 20-04-2017.
 */

abstract class AbstractRequest {
    String requestId
    Date creationDateTime
    String instructingAgentBIC
    String instructedAgentBIC
    Integer channelCode
}

class NameEnquiryRequest extends AbstractRequest {
    String targetAccountNumber
}

class BalanceEnquiryRequest extends AbstractRequest {
    String targetAccountName
    String targetAccountNumber
    String targetBankVerificationNumber
}
