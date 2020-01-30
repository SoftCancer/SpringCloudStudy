package com.yaogx.cloud_18_hystrix_turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

//@EnableEurekaClient
//@EnableHystrix
//@EnableHystrixDashboard
//@EnableCircuitBreaker
@EnableTurbine
@SpringBootApplication
public class CloudTurbineApplication {
    /**
     * http://localhost:9110/turbine.stream
     */
    public static void main(String[] args) {
        SpringApplication.run(CloudTurbineApplication.class, args);
    }
}
