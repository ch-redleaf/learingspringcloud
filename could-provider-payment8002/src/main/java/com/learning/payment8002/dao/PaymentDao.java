package com.learning.payment8002.dao;

import com.learning.common.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @className PaymentDao
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-8-3 22:44
 * @Version 1.0
 **/
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public  Payment getPaymentById(Long id);
}
