package com.dhj.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author:Hongjie Ding
 * @Description:
 * @Date:Created in 2020/4/5 22:20
 * @Modified By:
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "---PaymentFallbackService fallback paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "---PaymentFallbackService fallback paymentInfo_Timeout,o(╥﹏╥)o";
    }
}
