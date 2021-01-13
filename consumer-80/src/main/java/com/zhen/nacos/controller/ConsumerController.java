package com.zhen.nacos.controller;

import com.zhen.nacos.client.ProviderClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    //动态代理对象，内部远程调用服务提供者
    @Autowired
    ProviderClient providerClient;

    private static final Logger LOG = LoggerFactory.getLogger(ConsumerController.class);

    @GetMapping("/service")
    public String service(){
        //发起远程调用
        String result = providerClient.service();
        return "consumer invoke" + "|" + result;
    }
}
