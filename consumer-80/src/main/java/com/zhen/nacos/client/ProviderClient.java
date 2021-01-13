package com.zhen.nacos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider-8001")
public interface ProviderClient {

    @GetMapping("/service")
    public String service();
}
