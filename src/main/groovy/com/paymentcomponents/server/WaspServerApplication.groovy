package com.paymentcomponents.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class WaspServerApplication {

	static void main(String[] args) {
		SpringApplication.run WaspServerApplication, args
	}
}
