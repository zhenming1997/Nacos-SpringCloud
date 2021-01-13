package com.zhen.nacos.controller;

import com.zhen.nacos.service.ProviderService;
import com.zhen.nacos.service1.api.ConsumerService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Consumer;

@RestController
public class ApplicationController {

    //注入service（基于dubbo协议）
    @Reference
    ConsumerService consumerService;  //生成接口代理对象，通过代理对象进行远程调用

//    //注入service（基于dubbo协议）
    @Reference
    ProviderService providerService ;  //生成接口代理对象，通过代理对象进行远程调用

    @GetMapping("/service")
    public String service(){
        //远程调用
        String se = consumerService.service();
        String ser = providerService.service();
        return "test:" + se + ":" + ser;
    }
}
