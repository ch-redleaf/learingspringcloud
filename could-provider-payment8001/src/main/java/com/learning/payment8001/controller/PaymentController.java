package com.learning.payment8001.controller;

import com.learning.payment8001.entities.CommonResult;
import com.learning.payment8001.entities.Payment;
import com.learning.payment8001.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @className PaymentController
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-8-1 15:07
 * @Version 1.0
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info(serverPort + "插入结果：" + result);
        if (result > 0){
            return new CommonResult(200, "success:" + serverPort, result);
        }else {
            return new CommonResult(444, "failed:"  + serverPort, null);
        }
    }



    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info(serverPort + "查询结果：" + payment);
        if (payment != null){
            return new CommonResult(200, "success:"  + serverPort, payment);
        }else {
            return new CommonResult(444, "failed:"  + serverPort, null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery()
    {
        //获取所有服务
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("*****element: "+element);
        }

        //获取指定服务下的实例及部署的接口地址
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }

        return this.discoveryClient;
    }
}
