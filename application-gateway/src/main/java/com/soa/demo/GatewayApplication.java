package com.soa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.soa.demo"})
public class GatewayApplication
{

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
