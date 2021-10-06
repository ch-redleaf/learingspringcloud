package com.learning.payment8001.service;

import com.learning.common.entities.Payment;


public interface PaymentService {
    public int create(Payment payment);

    public  Payment getPaymentById(Long id);

    public String paymentInfo_TimeOut(Integer id);
}
