package com.dhj.springcloud.com.dhj.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:Hongjie Ding
 * @Description:
 * @Date:Created in 2020/4/2 12:02
 * @Modified By:
 */
@RestController
@Slf4j
public class OrderZKController {
    private static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;
    //Map<String,Object> hashMap = new HashMap<>();
    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo() {
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
        return result;

    }
}
