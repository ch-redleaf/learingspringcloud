package com.learning.order80;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @className OrderMain
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-8-1 23:35
 * @Version 1.0
 **/
@SpringBootApplication
@EnableFeignClients
public class OrderMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class, args);
    }
}
