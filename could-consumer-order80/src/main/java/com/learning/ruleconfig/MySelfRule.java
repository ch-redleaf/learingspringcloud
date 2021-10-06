package com.learning.ruleconfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className MySelfRule
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-9-15 23:42
 * @Version 1.0
 **/
@Configuration
public class MySelfRule {
    @Bean
    public IRule getRule(){
        return new RandomRule();
    }
}
