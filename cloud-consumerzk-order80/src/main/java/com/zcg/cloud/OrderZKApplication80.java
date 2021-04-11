package com.zcg.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author : zcg
 * @Data ：Create in 11:112021/4/11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZKApplication80.class,args);
    }
}
