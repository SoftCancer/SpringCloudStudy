package com.yaogx.cloud_16_sleuth_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudZipkinClient_2_Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudZipkinClient_2_Application.class, args);
    }
}
