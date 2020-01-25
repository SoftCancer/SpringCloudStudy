package com.yaogx.cloud_eureka_hystrix_02.service;

import org.springframework.stereotype.Component;

/**
 * @Description: 实现失败信息
 * @author: YaoGuangXun
 * @date: 2020/1/24 1:06
 * @Version: 1.0
 */
@Component
public class UserServiceImp implements IUserService {

    @Override
    public String getHiFromUserService(String name) {
        return "Hello " + name + " this message send failed !";
    }

}
