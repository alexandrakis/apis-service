package com.paymentcomponents.apis.service.repository

import com.paymentcomponents.apis.service.domain.DirectDebit
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by aalexandrakis on 25/04/2017.
 */
interface DirectDebitRepository extends JpaRepository<DirectDebit, Long> {
}
