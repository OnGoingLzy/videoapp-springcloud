package com.lzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class providerApplication {
    public static void main(String[] args) {
        SpringApplication.run(providerApplication.class, args);
    }
}