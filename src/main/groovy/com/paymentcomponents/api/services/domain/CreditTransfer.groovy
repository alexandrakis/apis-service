package com.paymentcomponents.api.services.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull

/**
 * Created by aalexandrakis on 25/04/2017.
 */
@Entity
@Table(name = "credit_transfer")
class CreditTransfer {
    @Id
    @GeneratedValue
    Long id
    @NotNull
    String requestId
    @NotNull
    String instructingInstitutionCode
    @NotNull
    int channelCode
    @NotNull
    String debtorName
    @NotNull
    String debtorAccount
    @NotNull
    String creditorName
    @NotNull
    String creditorAccount
    String creditorPhoneNumber
    String transactionLocation
    String endToEndId
    String transactionId
    String remittanceInformation

    CreditTransfer() {
    }

    CreditTransfer(String requestId, String instructingInstitutionCode, int channelCode, String debtorName, String debtorAccount, String creditorName, String creditorAccount, String creditorPhoneNumber, String transactionLocation, String endToEndId, String transactionId, String remittanceInformation) {
        this.requestId = requestId
        this.instructingInstitutionCode = instructingInstitutionCode
        this.channelCode = channelCode
        this.debtorName = debtorName
        this.debtorAccount = debtorAccount
        this.creditorName = creditorName
        this.creditorAccount = creditorAccount
        this.creditorPhoneNumber = creditorPhoneNumber
        this.transactionLocation = transactionLocation
        this.endToEndId = endToEndId
        this.transactionId = transactionId
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

    int getChannelCode() {
        return channelCode
    }

    void setChannelCode(int channelCode) {
        this.channelCode = channelCode
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

    String getTransactionLocation() {
        return transactionLocation
    }

    void setTransactionLocation(String transactionLocation) {
        this.transactionLocation = transactionLocation
    }

    String getEndToEndId() {
        return endToEndId
    }

    void setEndToEndId(String endToEndId) {
        this.endToEndId = endToEndId
    }

    String getTransactionId() {
        return transactionId
    }

    void setTransactionId(String transactionId) {
        this.transactionId = transactionId
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
                ", channelCode=" + channelCode +
                ", debtorName='" + debtorName + '\'' +
                ", debtorAccount='" + debtorAccount + '\'' +
                ", creditorName='" + creditorName + '\'' +
                ", creditorAccount='" + creditorAccount + '\'' +
                ", creditorPhoneNumber='" + creditorPhoneNumber + '\'' +
                ", transactionLocation='" + transactionLocation + '\'' +
                ", endToEndId='" + endToEndId + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", remittanceInformation='" + remittanceInformation + '\'' +
                '}';
    }
}
