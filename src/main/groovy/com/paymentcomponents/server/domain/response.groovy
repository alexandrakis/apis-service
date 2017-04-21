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


class CreditTransferResponse extends CreditTransferRequest  {
    String responseCode
}

class DirectDebitResponse extends DirectDebitRequest  {
    String responseCode
}

class TransactionStatusResponse extends TransactionStatusRequest  {
    String responseCode
}

class AmountBlockUnblockResponse extends AmountBlockUnblockRequest  {
    String responseCode
}

class AccountBlockUnblockResponse extends AccountBlockUnblockRequest  {
    String responseCode
}

class FinancialInstitutionResponse extends FinancialInstitutionRequest  {
    String responseCode

   String transactionLocation
   String numberOfRecords
   List<FinancialInstitution> records
}

class MandateAdviceResponse extends MandateAdviceRequest  {
    String responseCode
}