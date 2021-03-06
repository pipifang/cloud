package com.zcg.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author : zcg
 * @Data ：Create in 23:462021/4/6
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
@ComponentScan(basePackages = {"com.zcg.cloud.*"})
public class PaymentMain8006 {
    public static void main(String[] args) {
            SpringApplication.run(PaymentMain8006.class, args);
    }
}
