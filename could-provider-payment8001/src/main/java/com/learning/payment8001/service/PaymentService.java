package com.learning.payment8001.service;

import com.learning.payment8001.entities.Payment;

public interface PaymentService {
    public int create(Payment payment);

    public  Payment getPaymentById(Long id);
}
