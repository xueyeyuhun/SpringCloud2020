package com.dhj.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:Hongjie Ding
 * @Description:
 * @Date:Created in 2020/4/4 21:55
 * @Modified By:
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return  Logger.Level.FULL;
    }
}
