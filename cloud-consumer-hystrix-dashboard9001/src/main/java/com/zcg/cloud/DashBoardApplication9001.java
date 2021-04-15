package com.zcg.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author : zcg
 * @Data ：Create in 19:402021/4/15
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashBoardApplication9001 {
    public static void main(String[] args) {
        SpringApplication.run(DashBoardApplication9001.class,args);
    }
}
