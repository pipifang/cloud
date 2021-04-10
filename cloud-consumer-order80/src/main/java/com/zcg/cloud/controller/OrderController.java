package com.zcg.cloud.controller;

import com.zcg.cloud.entities.CommonResult;
import com.zcg.cloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author : zcg
 * @Data ：Create in 13:092021/4/10
 */
@RestController
@Slf4j
public class OrderController {

//    public static final String PAYMENT_URL = "http://localhost:8002";
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("consumer/payment/save")
    public CommonResult<Payment> save(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/save",payment,CommonResult.class);
    }

    @GetMapping("consumer/payment/getPaymentById/{id}")
    public CommonResult<Payment> savgetPaymentByIde(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/getPaymentById/"+id,CommonResult.class);
    }
}
