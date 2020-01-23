package com.yaogx.cloud_eureka_client_01;

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
public class CloudEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaClientApplication.class, args);
    }

}
