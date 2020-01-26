package com.yaogx.cloud_eureka_client_02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description: 服务的提供者
 * @Author: YaoGuangXun
 * @Date: 2020/1/23 14:32
 **/
@SpringBootApplication
@EnableEurekaClient // 开启EurekaClient 服务提供者
public class CloudEurekaClient02Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaClient02Application.class, args);
    }

}
