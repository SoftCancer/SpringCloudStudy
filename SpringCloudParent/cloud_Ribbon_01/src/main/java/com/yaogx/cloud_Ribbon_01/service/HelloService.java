package com.yaogx.cloud_Ribbon_01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @author: YaoGuangXun
 * @date: 2020/1/26 0:35
 * @Version: 1.0
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    // ribbon中它会根据服务名（SERVER-CLIEN）来选择具体的服务实例
    public String hiService(){
        return restTemplate.getForObject("http://SERVER-CLIEN/user/hello",String.class);
    }
}
