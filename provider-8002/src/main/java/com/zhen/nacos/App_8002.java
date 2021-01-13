package com.zhen.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //nacos客户端
@EnableFeignClients    //Feign远程调用
public class App_8002 {
    public static void main(String[] args) {
        SpringApplication.run(App_8002.class,args);
    }
}
