package com.learning.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @className CloudConfigServer3344
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-10-6 12:56
 * @Version 1.0
 **/
@SpringBootApplication
@EnableConfigServer
public class CloudConfigServer3344 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigServer3344.class, args);
    }
}
