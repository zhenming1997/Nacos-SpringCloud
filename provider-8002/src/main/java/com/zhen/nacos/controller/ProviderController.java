package com.zhen.nacos.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ProviderController {

    private static final Logger LOG = LoggerFactory.getLogger(ProviderController.class);

    @Value("${common.name}")
    private String name;
//    //获取上下文
//    @Autowired
//    ConfigurableApplicationContext applicationContext;

    @GetMapping("/service")
    public String service(){
//        LOG.info("provider invoke:" + applicationContext.getEnvironment().getProperty("common.name"));
        LOG.info("provider invoke:" + name);
        return "provider invoke";
    }
}
