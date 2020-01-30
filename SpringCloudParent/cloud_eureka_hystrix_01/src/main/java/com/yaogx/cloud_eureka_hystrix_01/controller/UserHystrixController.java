package com.yaogx.cloud_eureka_hystrix_01.controller;

import com.yaogx.cloud_eureka_hystrix_01.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:  服务消费者 控制层
 * @author: YaoGuangXun
 * @date: 2020/1/23 22:08
 * @Version: 1.0
 */
@RestController
public class UserHystrixController {

    @Autowired
    private IUserService userService;

    @GetMapping("/hello/{name}")
    public String getHello(@PathVariable String name){
        return userService.getHiFromUserService(name);
    }
}
