package com.zhen.nacos.service1.service;

import com.zhen.nacos.service.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

import java.security.Provider;

@Service   //注意是Dubbo注解
public class ConsumerService implements com.zhen.nacos.service1.api.ConsumerService {

    @Reference
    ProviderService providerService;

    //dubbo接口实现内容
    @Override
    public String service() {
        String ss = providerService.service();
        return "Consumer invoke:" + ss;
    }

}
