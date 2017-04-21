package com.paymentcomponents.server.domain

/**
 * Created by a.polichronopoulos on 20-04-2017.
 */

class NameEnquiryResponse extends NameEnquiryRequest {
    String responseCode

    String accountName
    String bankVerificationNumber
    String kycLevel
}

class BalanceEnquiryResponse extends BalanceEnquiryRequest {
    String responseCode

    Double availableBalance
}
