package com.yaogx.cloud_eureka_client_02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: YaoGuangXun
 * @date: 2020/1/23 14:30
 * @Version: 1.0
 */
@RestController
public class UserController {


    @Value("${server.port}")
    private String port;

    /**
     * 定义一个简单接口
     *
     * @param name
     * @return
     */
    @GetMapping("/hi/{name}")
    public String home(@PathVariable String name) {
        return "hi " + name + ",I am from port :" + port;
    }

    @GetMapping("/user/hello")
    public String hello(){
        return "服务提供者：cloud_eureka_client_02 ,Hello!  "+ port;
    }

}
