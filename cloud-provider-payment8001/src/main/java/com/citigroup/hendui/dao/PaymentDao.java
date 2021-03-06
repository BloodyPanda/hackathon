package com.citigroup.hendui.dao;

import com.citigroup.hendui.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Shawn
 * @date 2020/3/25 0:23
 * @title Function
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
