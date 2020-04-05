package com.dhj.springcloud.service;

import com.dhj.springcloud.dao.PaymentDao;
import com.dhj.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:Hongjie Ding
 * @Description:
 * @Date:Created in 2020/4/1 19:29
 * @Modified By:
 */
@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
