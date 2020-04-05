package com.dhj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author:Hongjie Ding
 * @Description:
 * @Date:Created in 2020/4/3 23:59
 * @Modified By:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsul8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsul8006.class, args);
    }
}
