package com.learning.order80.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @className ApplicationContextConfig
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-8-3 21:29
 * @Version 1.0
 **/
@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced
    public RestTemplate getResTemplate(){
        return new RestTemplate();
    }

}
