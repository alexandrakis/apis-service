package com.paymentcomponents.apis.service.repository

import com.paymentcomponents.apis.service.domain.CreditTransfer
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by aalexandrakis on 25/04/2017.
 */
interface CreditTransferRepository extends JpaRepository<CreditTransfer, Long> {
}
