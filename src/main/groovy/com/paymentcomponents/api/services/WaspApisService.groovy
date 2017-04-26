package com.paymentcomponents.api.services

import com.google.common.base.Predicate
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory
import org.springframework.web.client.RestTemplate
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

import static com.google.common.base.Predicates.or
import static springfox.documentation.builders.PathSelectors.regex

@EnableDiscoveryClient
@EnableZuulProxy
@EnableCircuitBreaker
@SpringBootApplication
@Configuration
@EnableSwagger2
class WaspApisService {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate(new HttpComponentsClientHttpRequestFactory())
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(paths())
                .build()
                .ignoredParameterTypes(MetaClass.class)
    }

    @Bean
    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("WASP SWITCH")
                .description('''WASP SWITCH APIs documentation.''')
                .termsOfServiceUrl("")
                .license("")
                .licenseUrl("")
                .version("1.0")
                .build()
    }

    //Here is an example where we select any api that matches one of these paths
    private static Predicate<String> paths() {
        return or(
                regex("/v1.*")
        )
    }

    static void main(String[] args) {
        SpringApplication.run WaspApisService, args
    }
}
