package com.techgenerale.transactionsmicroservice;

import org.springframework.boot.SpringApplication;

public class TestTransactionsMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.from(TransactionsMicroserviceApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
