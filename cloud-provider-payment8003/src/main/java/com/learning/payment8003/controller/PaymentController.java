package com.learning.payment8003.controller;

import com.learning.common.entities.CommonResult;
import com.learning.common.entities.Payment;
import com.learning.payment8003.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @className PaymentController
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-8-24 23:03
 * @Version 1.0
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info(serverPort + "插入结果：" + result);
        if (result > 0){
            return new CommonResult(200, "success: 服务端口：" + serverPort, result);
        }else {
            return new CommonResult(444, "failed:"  + serverPort, null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info(serverPort + "查询结果：" + payment);
        if (payment != null){
            return new CommonResult(200, "success: 服务端口："  + serverPort, payment);
        }else {
            return new CommonResult(444, "failed:"  + serverPort, null);
        }
    }
}