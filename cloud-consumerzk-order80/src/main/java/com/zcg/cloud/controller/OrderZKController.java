package com.zcg.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author : zcg
 * @Data ：Create in 11:162021/4/11
 */
@RestController
@Slf4j
public class OrderZKController {

    private static final String INVOKE_URL = "";

    @Resource
    private RestTemplate restTemplate;

    public String paymentInfo() {
        String result = restTemplate.getForObject(INVOKE_URL+"payment/zk",String.class);
        return result;
    }

}
