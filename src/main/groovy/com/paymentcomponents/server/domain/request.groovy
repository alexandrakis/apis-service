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

class CreditTransferRequest extends AbstractRequest {
    String clearingSystem
    String transactionId
    String endToendId
    String valueDate
    String currency
    String amount
    String chargeBearer

    String debtorName
    String debtorAccount
    String debtorBankVerificationNumber

    String creditorName
    String creditorAccount
    String creditorBankVerificationNumber

    String nameEnquiryRef
    String categoryPurpose
    String chargesAmount
    String instructedAmount
    String priority
    String transactionLocationLong
    String transactionLocationLat
    String remittanceInformation
    String debtorKYCLevel
    String creditorKYCLevel
}

class DirectDebitRequest extends AbstractRequest {
    String nameEnquiryRef
    String transactionId
    String endToendId
    String valueDate
    String categoryPurpose
    String currency
    String amount
    String instructedAmount
    String transactionFee
    String chargeBearer
    String mandateId
    String transactionLocation
    String remittanceInformation

    String debtorName
    String debtorAccount
    String debtorBankVerificationNumber
    String debtorKYCLevel

    String creditorName
    String creditorAccount
    String creditorBankVerificationNumber
    String creditorKYCLevel
}

class TransactionStatusRequest extends AbstractRequest {}

class AmountBlockUnblockRequest extends AbstractRequest {
    String referenceCode

    String targetAccountName
    String targetBankVerificationNumber
    String targetAccountNumber

    String reasonCode
    String remittanceInformation
    String amount
    String type
}

class AccountBlockUnblockRequest extends AbstractRequest {
    String referenceCode

    String targetAccountName
    String targetBankVerificationNumber
    String targetAccountNumber

    String reasonCode
    String remittanceInformation
    String type
}

class FinancialInstitutionRequest extends AbstractRequest {
    String batchNumber
}

class MandateAdviceRequest extends AbstractRequest {
    String amount
    String mandateReference

    String debtorName
    String debtorAccount
    String debtorBankVerificationNumber

    String creditorName
    String creditorAccount
    String creditorBankVerificationNumber

    String debtorKYCLevel
    String creditorKYCLevel
}