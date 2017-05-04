package com.paymentcomponents.apis.service.service

import com.paymentcomponents.apis.service.ERROR_CODES
import com.paymentcomponents.apis.service.domain.DirectDebit
import com.paymentcomponents.apis.service.exceptions.WaspApiValidationException
import com.paymentcomponents.apis.service.repository.DirectDebitRepository
import com.paymentcomponents.common.Utils
import com.paymentcomponents.common.request.DirectDebitRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by apolichronopoulos on 19/04/2017.
 */

@Service
class DirectDebitService {


    DirectDebitRepository directDebitRepository

    @Autowired
    DirectDebitService(DirectDebitRepository directDebitRepository) {
        this.directDebitRepository = directDebitRepository
    }

    public void directDebit(DirectDebitRequest request) throws Exception {
        try {
            DirectDebit directDebit
            directDebit = Utils.getObjectProperties(request) as DirectDebit
            directDebit.id = null
            directDebit.creationDateTime = new Date()
            directDebitRepository.save(directDebit)
        } catch (Exception ex) {
            throw new WaspApiValidationException(ERROR_CODES.invalid_request.toString(), ex.getMessage())
        }
    }

}
