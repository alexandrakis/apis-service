package com.paymentcomponents.api.services.service

import com.paymentcomponents.api.services.repository.CreditTransferRepository
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
        //Validate
        //Pairing
        //Storing
        creditTransferRepository.save(request)
    }

}
