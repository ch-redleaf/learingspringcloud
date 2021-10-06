package com.learning.order80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @className Order8ZK0Main
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-8-25 21:58
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Order8ZK0Main {
    public static void main(String[] args) {
        SpringApplication.run(Order8ZK0Main.class, args);
    }
}
