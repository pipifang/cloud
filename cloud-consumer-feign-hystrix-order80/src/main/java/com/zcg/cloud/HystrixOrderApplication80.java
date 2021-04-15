package com.zcg.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author : zcg
 * @Data ：Create in 21:192021/4/13
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class HystrixOrderApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixOrderApplication80.class,args);
    }
}
