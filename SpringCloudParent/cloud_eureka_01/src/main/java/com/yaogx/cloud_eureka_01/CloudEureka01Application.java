package com.yaogx.cloud_eureka_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  // 开启EurekaServer 注册中心
public class CloudEureka01Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEureka01Application.class, args);
    }

}
