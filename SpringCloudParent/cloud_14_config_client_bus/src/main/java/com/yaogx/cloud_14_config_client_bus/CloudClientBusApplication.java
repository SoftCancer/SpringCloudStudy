package com.yaogx.cloud_14_config_client_bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class CloudClientBusApplication {

    /* http://127.0.0.1:9106/actuator/bus-refresh : 重新读取配置文件*/
    public static void main(String[] args) {
        SpringApplication.run(CloudClientBusApplication.class, args);
    }
}
