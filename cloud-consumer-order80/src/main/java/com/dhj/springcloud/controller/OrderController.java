package com.dhj.springcloud.controller;

import com.dhj.springcloud.entities.CommonResult;
import com.dhj.springcloud.entities.Payment;
import com.dhj.springcloud.lb.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @Author:Hongjie Ding
 * @Description:
 * @Date:Created in 2020/4/1 21:05
 * @Modified By:
 */
@Slf4j
@RestController
public class OrderController {
//    public static final String PAYMENT_URL="http://localhost:8001";(单机版)
    public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";//集群版
    @Resource
    private RestTemplate restTemplate;

    @Resource
    private LoadBalancer loadBalancer;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return  restTemplate.postForObject("http://localhost:8001/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id, CommonResult.class);
    }

    @GetMapping("/consumer/payment/lb")
    public String getPaymentLB(){
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if (instances==null || instances.size()<=0){
            return null;
        }
        ServiceInstance serviceInstance = loadBalancer.instances(instances);
        URI serviceInstanceUri = serviceInstance.getUri();
        return restTemplate.getForObject(serviceInstanceUri+"/payment/lb", String.class);
    }
}

