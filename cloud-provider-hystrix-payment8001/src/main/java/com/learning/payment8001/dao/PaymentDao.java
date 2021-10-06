package com.learning.payment8001.dao;

import com.learning.common.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
/**
* @author XiaoHan
* @Description
* @Date
* @Param
* @return
**/
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public  Payment getPaymentById(Long id);
}
