package com.zcg.cloud.service.impl;

import com.zcg.cloud.dao.PaymentDao;
import com.zcg.cloud.entities.Payment;
import com.zcg.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author : zcg
 * @Data ：Create in 11:172021/4/10
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int save(Payment payment) {
        return paymentDao.save(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
