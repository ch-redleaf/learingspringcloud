package com.learing.order80.service.impl;

import com.learing.order80.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

import java.lang.reflect.ParameterizedType;

/**
 * @className PaymentHystrixFallback
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-9-30 12:54
 * @Version 1.0
 **/
@Component
public class PaymentHystrixFallback implements PaymentHystrixService {

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "order80 service实现方法 运行出错";
    }
}
