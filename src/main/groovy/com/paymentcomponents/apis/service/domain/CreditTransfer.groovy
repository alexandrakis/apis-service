package com.paymentcomponents.apis.service.domain

import javax.persistence.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

/**
 * Created by aalexandrakis on 25/04/2017.
 */
@Entity
@Table(name = "credit_transfers")
class CreditTransfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id
    @NotNull
    @Size(max = 30)
    String requestId
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
    @Size(max = 20)
    String debtorAccount
    @NotNull
    @Size(max = 100)
    String creditorName
    @NotNull
    @Size(max = 20)
    String creditorAccount
    // ------ OPTIONAL FIELDS ------------
    @Size(max = 20)
    String creditorPhoneNumber
    @Size(max = 4)
    String categoryPurpose
    Double chargesAmount
    Double instructedAmount
    @Size(max = 30)
    String transactionLocationLong
    @Size(max = 30)
    String transactionLocationLat
    @Size(max = 500)
    String remittanceInformation

    CreditTransfer() {
    }

    CreditTransfer(String requestId, String instructingInstitutionCode, String instructedInstitutionCode, int channelCode, String transactionId, String endToEndId, Date valueDate, String currency, Double amount, String chargeBearer, String debtorName, String debtorAccount, String creditorName, String creditorAccount, String creditorPhoneNumber, String categoryPurpose, Double chargesAmount, Double instructedAmount, String transactionLocationLong, String transactionLocationLat, String remittanceInformation) {
        this.requestId = requestId
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
        this.creditorPhoneNumber = creditorPhoneNumber
        this.categoryPurpose = categoryPurpose
        this.chargesAmount = chargesAmount
        this.instructedAmount = instructedAmount
        this.transactionLocationLong = transactionLocationLong
        this.transactionLocationLat = transactionLocationLat
        this.remittanceInformation = remittanceInformation
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

    String getCreditorPhoneNumber() {
        return creditorPhoneNumber
    }

    void setCreditorPhoneNumber(String creditorPhoneNumber) {
        this.creditorPhoneNumber = creditorPhoneNumber
    }

    String getCategoryPurpose() {
        return categoryPurpose
    }

    void setCategoryPurpose(String categoryPurpose) {
        this.categoryPurpose = categoryPurpose
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


    @Override
    public String toString() {
        return "CreditTransfer{" +
                "id=" + id +
                ", requestId='" + requestId + '\'' +
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
                ", creditorPhoneNumber='" + creditorPhoneNumber + '\'' +
                ", categoryPurpose='" + categoryPurpose + '\'' +
                ", chargesAmount=" + chargesAmount +
                ", instructedAmount=" + instructedAmount +
                ", transactionLocationLong='" + transactionLocationLong + '\'' +
                ", transactionLocationLat='" + transactionLocationLat + '\'' +
                ", remittanceInformation='" + remittanceInformation + '\'' +
                '}';
    }
}
