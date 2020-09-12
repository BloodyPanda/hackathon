package com.citigroup.hendui.service.impl;

import com.citigroup.hendui.dao.PaymentDao;
import com.citigroup.hendui.service.PaymentService;
import com.citigroup.hendui.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Shawn
 * @date 2020/3/25 0:37
 * @title Function
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
