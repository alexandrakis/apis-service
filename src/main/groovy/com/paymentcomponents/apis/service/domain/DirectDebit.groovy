package com.paymentcomponents.apis.service.domain

import javax.persistence.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

/**
 * Created by aalexandrakis on 25/04/2017.
 */
@Entity
@Table(name = "direct_debits")
class DirectDebit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id
    @NotNull
    @Size(max = 30)
    String requestId
    Date creationDateTime
    @NotNull
    @Size(max = 3, min = 3)
    String instructingInstitutionCode
    @NotNull
    @Size(max = 3, min = 3)
    String instructedInstitutionCode
    @NotNull
    int channelCode
    @NotNull
    @Size(max = 35)
    String transactionId
    @NotNull
    @Size(max = 35)
    String endToEndId
    @NotNull
    Date valueDate
    @NotNull
    @Size(max = 3, min = 3)
    String currency
    @NotNull
    Double amount
    @NotNull
    @Size(max = 4)
    String chargeBearer
    @NotNull
    @Size(max = 100)
    String debtorName
    @NotNull
    @Size(max = 35)
    String debtorAccount
    @NotNull
    @Size(max = 100)
    String creditorName
    @NotNull
    @Size(max = 35)
    String creditorAccount

    // Optional fields --------------

    @Size(max = 20)
    String debtorBankVerificationNumber
    @Size(max = 20)
    String creditorBankVerificationNumber
    Double chargesAmount
    Double instructedAmount
    @Size(max = 30)
    String nameEnquiryReference
    @Size(max = 4)
    String categoryPurpose
    @Size(max = 4)
    String priority
    @Size(max = 30)
    String transactionLocationLong
    @Size(max = 30)
    String transactionLocationLat
    @Size(max = 500)
    String remittanceInformation
    @Size(max = 30)
    String mandateId

    DirectDebit() {
    }

    Long getId() {
        return id
    }

    void setId(Long id) {
        this.id = id
    }

    String getRequestId() {
        return requestId
    }

    void setRequestId(String requestId) {
        this.requestId = requestId
    }

    Date getCreationDateTime() {
        return creationDateTime
    }

    void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime
    }

    String getInstructingInstitutionCode() {
        return instructingInstitutionCode
    }

    void setInstructingInstitutionCode(String instructingInstitutionCode) {
        this.instructingInstitutionCode = instructingInstitutionCode
    }

    String getInstructedInstitutionCode() {
        return instructedInstitutionCode
    }

    void setInstructedInstitutionCode(String instructedInstitutionCode) {
        this.instructedInstitutionCode = instructedInstitutionCode
    }

    int getChannelCode() {
        return channelCode
    }

    void setChannelCode(int channelCode) {
        this.channelCode = channelCode
    }

    String getTransactionId() {
        return transactionId
    }

    void setTransactionId(String transactionId) {
        this.transactionId = transactionId
    }

    String getEndToEndId() {
        return endToEndId
    }

    void setEndToEndId(String endToEndId) {
        this.endToEndId = endToEndId
    }

    Date getValueDate() {
        return valueDate
    }

    void setValueDate(Date valueDate) {
        this.valueDate = valueDate
    }

    String getCurrency() {
        return currency
    }

    void setCurrency(String currency) {
        this.currency = currency
    }

    Double getAmount() {
        return amount
    }

    void setAmount(Double amount) {
        this.amount = amount
    }

    String getChargeBearer() {
        return chargeBearer
    }

    void setChargeBearer(String chargeBearer) {
        this.chargeBearer = chargeBearer
    }

    String getDebtorName() {
        return debtorName
    }

    void setDebtorName(String debtorName) {
        this.debtorName = debtorName
    }

    String getDebtorAccount() {
        return debtorAccount
    }

    void setDebtorAccount(String debtorAccount) {
        this.debtorAccount = debtorAccount
    }

    String getCreditorName() {
        return creditorName
    }

    void setCreditorName(String creditorName) {
        this.creditorName = creditorName
    }

    String getCreditorAccount() {
        return creditorAccount
    }

    void setCreditorAccount(String creditorAccount) {
        this.creditorAccount = creditorAccount
    }

    String getDebtorBankVerificationNumber() {
        return debtorBankVerificationNumber
    }

    void setDebtorBankVerificationNumber(String debtorBankVerificationNumber) {
        this.debtorBankVerificationNumber = debtorBankVerificationNumber
    }

    String getCreditorBankVerificationNumber() {
        return creditorBankVerificationNumber
    }

    void setCreditorBankVerificationNumber(String creditorBankVerificationNumber) {
        this.creditorBankVerificationNumber = creditorBankVerificationNumber
    }

    Double getChargesAmount() {
        return chargesAmount
    }

    void setChargesAmount(Double chargesAmount) {
        this.chargesAmount = chargesAmount
    }

    Double getInstructedAmount() {
        return instructedAmount
    }

    void setInstructedAmount(Double instructedAmount) {
        this.instructedAmount = instructedAmount
    }

    String getNameEnquiryReference() {
        return nameEnquiryReference
    }

    void setNameEnquiryReference(String nameEnquiryReference) {
        this.nameEnquiryReference = nameEnquiryReference
    }

    String getCategoryPurpose() {
        return categoryPurpose
    }

    void setCategoryPurpose(String categoryPurpose) {
        this.categoryPurpose = categoryPurpose
    }

    String getPriority() {
        return priority
    }

    void setPriority(String priority) {
        this.priority = priority
    }

    String getTransactionLocationLong() {
        return transactionLocationLong
    }

    void setTransactionLocationLong(String transactionLocationLong) {
        this.transactionLocationLong = transactionLocationLong
    }

    String getTransactionLocationLat() {
        return transactionLocationLat
    }

    void setTransactionLocationLat(String transactionLocationLat) {
        this.transactionLocationLat = transactionLocationLat
    }

    String getRemittanceInformation() {
        return remittanceInformation
    }

    void setRemittanceInformation(String remittanceInformation) {
        this.remittanceInformation = remittanceInformation
    }

    String getMandateId() {
        return mandateId
    }

    void setMandateId(String mandateId) {
        this.mandateId = mandateId
    }

    DirectDebit(String requestId, Date creationDateTime, String instructingInstitutionCode, String instructedInstitutionCode, int channelCode, String transactionId, String endToEndId, Date valueDate, String currency, Double amount, String chargeBearer, String debtorName, String debtorAccount, String creditorName, String creditorAccount, String debtorBankVerificationNumber, String creditorBankVerificationNumber, Double chargesAmount, Double instructedAmount, String nameEnquiryReference, String categoryPurpose, String priority, String transactionLocationLong, String transactionLocationLat, String remittanceInformation, String mandateId) {

        this.requestId = requestId
        this.creationDateTime = creationDateTime
        this.instructingInstitutionCode = instructingInstitutionCode
        this.instructedInstitutionCode = instructedInstitutionCode
        this.channelCode = channelCode
        this.transactionId = transactionId
        this.endToEndId = endToEndId
        this.valueDate = valueDate
        this.currency = currency
        this.amount = amount
        this.chargeBearer = chargeBearer
        this.debtorName = debtorName
        this.debtorAccount = debtorAccount
        this.creditorName = creditorName
        this.creditorAccount = creditorAccount
        this.debtorBankVerificationNumber = debtorBankVerificationNumber
        this.creditorBankVerificationNumber = creditorBankVerificationNumber
        this.chargesAmount = chargesAmount
        this.instructedAmount = instructedAmount
        this.nameEnquiryReference = nameEnquiryReference
        this.categoryPurpose = categoryPurpose
        this.priority = priority
        this.transactionLocationLong = transactionLocationLong
        this.transactionLocationLat = transactionLocationLat
        this.remittanceInformation = remittanceInformation
        this.mandateId = mandateId
    }

    @Override
    public String toString() {
        return "DirectDebit{" +
                "id=" + id +
                ", requestId='" + requestId + '\'' +
                ", creationDateTime=" + creationDateTime +
                ", instructingInstitutionCode='" + instructingInstitutionCode + '\'' +
                ", instructedInstitutionCode='" + instructedInstitutionCode + '\'' +
                ", channelCode=" + channelCode +
                ", transactionId='" + transactionId + '\'' +
                ", endToEndId='" + endToEndId + '\'' +
                ", valueDate=" + valueDate +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                ", chargeBearer='" + chargeBearer + '\'' +
                ", debtorName='" + debtorName + '\'' +
                ", debtorAccount='" + debtorAccount + '\'' +
                ", creditorName='" + creditorName + '\'' +
                ", creditorAccount='" + creditorAccount + '\'' +
                ", debtorBankVerificationNumber='" + debtorBankVerificationNumber + '\'' +
                ", creditorBankVerificationNumber='" + creditorBankVerificationNumber + '\'' +
                ", chargesAmount=" + chargesAmount +
                ", instructedAmount=" + instructedAmount +
                ", nameEnquiryReference='" + nameEnquiryReference + '\'' +
                ", categoryPurpose='" + categoryPurpose + '\'' +
                ", priority='" + priority + '\'' +
                ", transactionLocationLong='" + transactionLocationLong + '\'' +
                ", transactionLocationLat='" + transactionLocationLat + '\'' +
                ", remittanceInformation='" + remittanceInformation + '\'' +
                ", mandateId='" + mandateId + '\'' +
                '}';
    }
}
