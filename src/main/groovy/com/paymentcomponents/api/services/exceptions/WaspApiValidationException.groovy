package com.paymentcomponents.api.services.exceptions

/**
 * Created by aalexandrakis on 25/04/2017.
 */
class WaspApiValidationException extends Exception {

    private String errorCode

    public WaspApiValidationException(String errorCode) {
        super()
        this.errorCode = errorCode
    }

    public String getErrorCode() {
        return errorCode
    }

    public WaspApiValidationException setErrorCode(String errorCode) {
        this.errorCode = errorCode
        return this
    }
}
