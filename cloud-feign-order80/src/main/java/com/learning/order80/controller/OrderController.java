package com.learning.order80.controller;

import com.learning.common.entities.CommonResult;
import com.learning.common.entities.Payment;
import com.learning.order80.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @className OrderController
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-8-3 21:32
 * @Version 1.0
 **/
@RestController
@Slf4j
public class OrderController {

    @Resource
    PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById(id);

    }

}
