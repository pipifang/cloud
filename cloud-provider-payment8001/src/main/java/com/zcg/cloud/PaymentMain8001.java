package com.zcg.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author : zcg
 * @Data ：Create in 23:462021/4/6
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.zcg.cloud.*"})
public class PaymentMain8001 {
    public static void main(String[] args) {
            SpringApplication.run(PaymentMain8001.class, args);
    }
}
