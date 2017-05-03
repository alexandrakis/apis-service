# WASP Switch APIs Implementation

## Create DB Statements
```
CREATE TABLE public.credit_transfers
(
  id                           SERIAL PRIMARY KEY NOT NULL,
  request_id                   VARCHAR(30)        NOT NULL,
  instructing_institution_code CHAR(3)            NOT NULL,
  instructed_institution_code  CHAR(3)            NOT NULL,
  channel_code                 INT                NOT NULL,
  transaction_id               VARCHAR(35)        NOT NULL,
  end_to_end_id                VARCHAR(35)        NOT NULL,
  value_date                   TIMESTAMP          NOT NULL,
  currency                     CHAR(3)            NOT NULL,
  amount                       DECIMAL            NOT NULL,
  charge_bearer                CHAR(4)            NOT NULL,
  debtor_name                  VARCHAR(100)       NOT NULL,
  debtor_account               VARCHAR(20)        NOT NULL,
  creditor_name                VARCHAR(100)       NOT NULL,
  creditor_account             VARCHAR(20)        NOT NULL,
  creditor_phone_number        VARCHAR(20),
  category_purpose             CHAR(4),
  charges_amount               DECIMAL,
  instructed_amount            DECIMAL,
  transaction_location_long    VARCHAR(30),
  transaction_location_lat     VARCHAR(30),
  remittance_information       VARCHAR(500)
);
CREATE UNIQUE INDEX credit_transfers_id_uindex ON public.credit_transfers (id);
CREATE UNIQUE INDEX credit_transfers_request_id_uindex ON public.credit_transfers (request_id);


CREATE TABLE public.direct_debits
(
  id                           SERIAL PRIMARY KEY NOT NULL,
  request_id                   VARCHAR(30)        NOT NULL,
  instructing_institution_code CHAR(3)            NOT NULL,
  instructed_institution_code  CHAR(3)            NOT NULL,
  channel_code                 INT                NOT NULL,
  transaction_id               VARCHAR(35)        NOT NULL,
  end_to_end_id                VARCHAR(35)        NOT NULL,
  value_date                   TIMESTAMP          NOT NULL,
  currency                     CHAR(3)            NOT NULL,
  amount                       DECIMAL            NOT NULL,
  charge_bearer                CHAR(4)            NOT NULL,
  debtor_name                  VARCHAR(100)       NOT NULL,
  debtor_account               VARCHAR(20)        NOT NULL,
  creditor_name                VARCHAR(100)       NOT NULL,
  creditor_account             VARCHAR(20)        NOT NULL,
  creditor_phone_number        VARCHAR(20),
  category_purpose             CHAR(4),
  charges_amount               DECIMAL,
  instructed_amount            DECIMAL,
  transaction_location_long    VARCHAR(30),
  transaction_location_lat     VARCHAR(30),
  remittance_information       VARCHAR(500),
  mandate_id                   VARCHAR(30)
);
CREATE UNIQUE INDEX direct_debits_id_uindex ON public.direct_debits (id);
CREATE UNIQUE INDEX direct_debits_request_id_uindex ON public.direct_debits (request_id);
```

## Installation instructions
Build a docker image from [here](./Dockerfile)
```
docker build -t wasp/apis-service .
```
Start a docker container from the image
```
docker run -it -d -p 9055:8080 \
-v /etc/timezone:/etc/timezone \
-v /home/teamcity/apps_properties/wasp_apis_service:/properties/ \
-v /home/teamcity/apps_logs/wasp_apis_service:/var/log/ \
--name wasp-apis-service wasp/apis-service
```
Default properties are the following. If you want to override some or all default properties create a property file with the parameters you want to override and run the java jar with this environment property ```--spring.config.location=/properties/application.properties```.
```
spring.application.name=apis-service
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
eureka.instance.non-secure-port=9055
eureka.instance.metadataMap.instanceId=${spring.application.name}:9055

#Zipkin
spring.zipkin.enabled=true
spring.zipkin.baseUrl=http://192.168.101.6:9012

#LOGGING
logging.level.root=INFO
logging.level.org.springframework.web=INFO
logging.level.org.hibernate=INFO
```