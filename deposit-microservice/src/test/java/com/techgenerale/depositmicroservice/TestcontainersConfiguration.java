package com.techgenerale.depositmicroservice;

import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.context.TestConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
class TestcontainersConfiguration {

    private static PostgreSQLContainer container = new PostgreSQLContainer<>(DockerImageName.parse("postgres:12-alpine"));


    @DynamicPropertySource
    void postgresqlProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", container::getJdbcUrl);
        registry.add("spring.datasource.username", container::getUsername);
        registry.add("spring.datasource.password", container::getPassword);

    }

    @BeforeAll
    static void bootstrapContainer() {
        container.start();
    }

}
