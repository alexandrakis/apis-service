package com.paymentcomponents.api.services.service

import com.paymentcomponents.api.services.domain.CreditTransfer
import com.paymentcomponents.api.services.exceptions.WaspApiValidationException
import com.paymentcomponents.api.services.repository.CreditTransferRepository
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
            throw new WaspApiValidationException("invalid_request")
        }
        //Pairing
        //Storing
        creditTransferRepository.save(creditTransfer)
    }

}
