package com.paymentcomponents.api.services.repository

import com.paymentcomponents.api.services.domain.CreditTransfer
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by aalexandrakis on 25/04/2017.
 */
interface CreditTransferRepository extends JpaRepository<CreditTransfer, Long> {
}
