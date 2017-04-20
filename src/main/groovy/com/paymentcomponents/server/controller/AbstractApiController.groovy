package com.paymentcomponents.server.controller

import com.paymentcomponents.common.log.RequestLogger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.MessageSource

/**
 * Created by apolichronopoulos on 19/04/2017.
 */
public abstract class AbstractApiController {

    final protected RequestLogger log = new RequestLogger(getClass().getName())

    @Autowired
    protected MessageSource messageSource

}
