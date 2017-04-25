# WASP Switch APIs Implementation

## Create DB Statements
```
CREATE TABLE wasp_db.credit_transfer
(
    id SERIAL PRIMARY KEY NOT NULL,
    request_id VARCHAR(30) NOT NULL,
    instructing_institution_code CHAR(3) NOT NULL,
    channel_code INT NOT NULL,
    debtor_name VARCHAR(100) NOT NULL,
    debtor_account VARCHAR(20) NOT NULL,
    creditor_name VARCHAR(100) NOT NULL,
    creditor_account VARCHAR(20) NOT NULL,
    creditor_phone_number VARCHAR(20),
    transaction_location VARCHAR(30),
    end_to_end_id VARCHAR(35),
    transaction_id VARCHAR(500),
    remittance_information VARCHAR(500)
);
CREATE UNIQUE INDEX credit_transfer_id_uindex ON wasp_db.credit_transfer (id);
CREATE UNIQUE INDEX credit_transfer_request_id_uindex ON wasp_db.credit_transfer (request_id);
```