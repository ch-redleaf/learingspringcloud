package com.learning.payment8002.service.impl;

import com.learning.common.entities.Payment;
import com.learning.payment8002.dao.PaymentDao;
import com.learning.payment8002.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @className PaymentServiceImpl
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-8-3 22:46
 * @Version 1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
