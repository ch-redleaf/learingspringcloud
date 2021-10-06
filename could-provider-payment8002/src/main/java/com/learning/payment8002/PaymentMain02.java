package com.learning.payment8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @className PaymentMain02
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-8-3 22:42
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain02 {
    public static void main(String[] args){
        SpringApplication.run(PaymentMain02.class, args);
    }
}
