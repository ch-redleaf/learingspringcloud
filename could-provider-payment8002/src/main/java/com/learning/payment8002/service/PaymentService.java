package com.learning.payment8002.service;

import com.learning.common.entities.Payment;

/**
 * @className PaymentService
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-8-3 22:45
 * @Version 1.0
 **/
public interface PaymentService {
    public int create(Payment payment);

    public  Payment getPaymentById(Long id);
}
