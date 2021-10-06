package com.learning.order80.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className FeignConfig
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-9-28 17:34
 * @Version 1.0
 **/
@Configuration
public class FeignConfig
{
    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }
}
