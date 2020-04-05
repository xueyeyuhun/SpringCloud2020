package com.dhj.springcloud.dao;

import com.dhj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author:Hongjie Ding
 * @Description:
 * @Date:Created in 2020/4/1 19:21
 * @Modified By:
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);


}
