package com.yaogx.cloud_eureka_hystrix_02.controller;

import com.yaogx.cloud_eureka_hystrix_02.service.IUserService;
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
public class UserFeignController {

    @Autowired
    private IUserService userService;

    @GetMapping("/hello/{name}")
    public String getHello(@PathVariable String name){
        return userService.getHiFromUserService(name);
    }
}
