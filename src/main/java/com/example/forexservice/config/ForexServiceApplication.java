package com.example.forexservice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.forexservice")
@EntityScan(basePackages = "com.example.forexservice.domain")
@EnableJpaRepositories(basePackages = "com.example.forexservice.repository")
public class ForexServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ForexServiceApplication.class, args);
    }
}
