package com.techgenerale.depositmicroservice;

import org.springframework.boot.SpringApplication;

public class TestDepositMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.from(DepositMicroserviceApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
