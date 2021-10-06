package com.learning.order80.lib;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
* @author XiaoHan
* @Description
* @Date 15:11 2021-9-23
* @Param
* @return
**/
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
