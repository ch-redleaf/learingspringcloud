package com.cloud.learing.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className GateWayConfig
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-10-3 14:36
 * @Version 1.0
 **/
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder)
    {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("id-1",
                r -> r.path("/payment/get/**")
                        .uri("http://localhost:8002/payment/get/")).build();
        return routes.build();
    }

}
