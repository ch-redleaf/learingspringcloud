package com.learing.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @className dashboard9001
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-10-2 17:21
 * @Version 1.0
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class dashboard9001 {
    public static void main(String[] args) {
        SpringApplication.run(dashboard9001.class, args);
    }
}
