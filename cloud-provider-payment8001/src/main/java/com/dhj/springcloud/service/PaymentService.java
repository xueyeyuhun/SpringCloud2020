package com.dhj.springcloud.service;

import com.dhj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author:Hongjie Ding
 * @Description:
 * @Date:Created in 2020/4/1 19:28
 * @Modified By:
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
