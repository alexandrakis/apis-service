package com.paymentcomponents.server.controller

import com.paymentcomponents.common.request.InitRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpEntity
import org.springframework.http.HttpMethod
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

/**
 * Created by apolichronopoulos on 19/04/2017.
 */
@RestController
class ApiController extends AbstractApiController {

    private final RestTemplate restTemplate

    @Autowired
    ApiController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate
    }

    @RequestMapping(method = RequestMethod.GET, value = "/random")
    public @ResponseBody
    String getRandomString() {
        return UUID.randomUUID().toString()
    }

    @RequestMapping(method = RequestMethod.GET, value = "/clients")
    public @ResponseBody
    def getClients() {
        InitRequest initRequest = new InitRequest()
        this.restTemplate.exchange("http://application-gateway/clients", HttpMethod.GET, new HttpEntity<InitRequest>(initRequest), new ParameterizedTypeReference<Object>() {})
    }

}
