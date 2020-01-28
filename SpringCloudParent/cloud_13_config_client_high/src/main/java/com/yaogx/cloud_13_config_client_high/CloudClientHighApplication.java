package com.yaogx.cloud_13_config_client_high;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudClientHighApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudClientHighApplication.class, args);
    }

}
