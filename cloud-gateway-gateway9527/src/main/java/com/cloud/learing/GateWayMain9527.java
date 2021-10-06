package com.cloud.learing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @className GateWayMain9527
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-10-3 12:29
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain9527.class, args);
    }
}
