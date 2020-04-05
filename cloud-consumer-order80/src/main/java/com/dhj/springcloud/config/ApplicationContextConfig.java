package com.dhj.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:Hongjie Ding
 * @Description:
 * @Date:Created in 2020/4/1 21:07
 * @Modified By:
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    //@LoadBalanced//开启负载均衡，默认轮询模式
    public RestTemplate getRestTemplate() {
        return  new RestTemplate();
    }
}
