package com.zhen.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.SpringVersion;

@SpringBootApplication
@EnableDiscoveryClient //nacos客户端
public class app {
    public static void main(String[] args) {
        SpringApplication.run(app.class,args);
    }
}
