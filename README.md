# WASP Switch APIs Implementation

## Create DB Statements
```
CREATE TABLE public.credit_transfer
(
    id SERIAL PRIMARY KEY NOT NULL,
    request_id VARCHAR(30) NOT NULL,
    instructing_institution_code CHAR(3) NOT NULL,
    instructed_institution_code CHAR(3) NOT NULL,
    channel_code INT NOT NULL,
    debtor_name VARCHAR(100) NOT NULL,
    debtor_account VARCHAR(20) NOT NULL,
    creditor_name VARCHAR(100) NOT NULL,
    creditor_account VARCHAR(20) NOT NULL,
    creditor_phone_number VARCHAR(20),
    transaction_location VARCHAR(30),
    end_to_end_id VARCHAR(35),
    transaction_id VARCHAR(35),
    remittance_information VARCHAR(500)
);
CREATE UNIQUE INDEX credit_transfer_id_uindex ON public.credit_transfer (id);
CREATE UNIQUE INDEX credit_transfer_request_id_uindex ON public.credit_transfer (request_id);
```

## Installation instructions
Build a docker image from [here](./Dockerfile)
```
docker build -t wasp/api-services .
```
Start a docker container from the image
```
docker run -it -d -p 9055:8080 \
-v /etc/timezone:/etc/timezone \
-v /home/teamcity/apps_properties/wasp_api_services:/properties/ \
-v /home/teamcity/apps_logs/wasp_api_services:/var/log/ \
--name wasp-api-services wasp/app-services
```
Default properties are the following. If you want to override some or all default properties create a property file with the parameters you want to override and run the java jar with this environment property ```--spring.config.location=/properties/application.properties```.
```
spring.application.name=apis-services
server.port=8080
#Data Source
spring.datasource.url=jdbc:postgresql://192.168.101.6:5432/wasp_db
spring.jpa.database-platform=POSTGRESQL
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQL94Dialect
spring.jpa.properties.hibernate.default_scheme=public
spring.datasource.username=postgres
spring.datasource.password=Asd123!.
spring.datasource.driver-class-name=org.postgresql.Driver
#Number of ms to wait before throwing an exception if no connection is available.
spring.datasource.tomcat.max-wait=10000
#Maximum number of active connections that can be allocated from this pool at the same time.
spring.datasource.tomcat.max-active=50
#JPA
spring.jpa.show-sql=true
#Registry
eureka.client.service-url.defaultZone= http://192.168.101.6:9010/eureka/
eureka.instance.prefer-ip-address=true
eureka.instance.ip-address=192.168.101.6
eureka.instance.non-secure-port=9020
eureka.instance.metadataMap.instanceId=${spring.application.name}:9020
#Zipkin
spring.zipkin.enabled=true
spring.zipkin.baseUrl=http://192.168.101.6:9012

logging.level.root=INFO
logging.level.org.springframework.web=INFO
logging.level.org.hibernate=INFO
```