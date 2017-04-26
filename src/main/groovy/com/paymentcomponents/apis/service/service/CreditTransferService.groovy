package com.paymentcomponents.apis.service.service

import com.paymentcomponents.apis.service.ERROR_CODES
import com.paymentcomponents.apis.service.domain.CreditTransfer
import com.paymentcomponents.apis.service.exceptions.WaspApiValidationException
import com.paymentcomponents.apis.service.repository.CreditTransferRepository
import com.paymentcomponents.common.Utils
import com.paymentcomponents.common.request.CreditTransferRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by apolichronopoulos on 19/04/2017.
 */

@Service
class CreditTransferService {


    CreditTransferRepository creditTransferRepository

    @Autowired
    CreditTransferService(CreditTransferRepository creditTransferRepository) {
        this.creditTransferRepository = creditTransferRepository
    }

    public void creditTransfer(CreditTransferRequest request) throws Exception {
        CreditTransfer creditTransfer
        //Validate
        try {
            creditTransfer = Utils.getObjectProperties(request) as CreditTransfer
            creditTransfer.id = null
        } catch (Exception ex) {
            throw new WaspApiValidationException(ERROR_CODES.invalid_request.toString(), ex.getMessage())
        }
        //Pairing
        //Storing
        creditTransferRepository.save(creditTransfer)
    }

}
