package com.yaogx.cloud_15_zipkin_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;

@EnableDiscoveryClient
@EnableZipkinServer   //注解的作用: 开启zipkin功能
@SpringBootApplication
public class CloudZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudZipkinServerApplication.class, args);
    }
}
