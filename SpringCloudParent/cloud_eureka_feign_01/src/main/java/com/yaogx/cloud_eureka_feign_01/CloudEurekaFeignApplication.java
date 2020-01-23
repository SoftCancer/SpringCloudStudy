package com.yaogx.cloud_eureka_feign_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  服务消费者
 * @Date: 2020/1/23 22:05
 **/

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients   //开启Feign的功能
public class CloudEurekaFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaFeignApplication.class, args);
    }

}
