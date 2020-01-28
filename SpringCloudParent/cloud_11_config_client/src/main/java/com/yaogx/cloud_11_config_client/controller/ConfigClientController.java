package com.yaogx.cloud_11_config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: YaoGuangXun
 * @date: 2020/1/25 23:37
 * @Version: 1.0
 */

@RestController
public class ConfigClientController {


    // 果获取不到冒号前的配置，则使用冒号后作为默认值
   //@Value("${yaosy:yaosy default}")
    @Value("${yaosy}")
    private String yaosy;

    @Value("${github}")
    private String github;

    @GetMapping("/yaosy")
    public String getYaosy(){
        return yaosy +"的 github地址：\n" + github;
    }

}
