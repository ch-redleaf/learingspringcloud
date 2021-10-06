package com.learning.payment8001.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @className Payment
 * @Description TODO
 * @Author XiaoHan
 * @Date 2021-8-1 14:00
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long paymentId;
    private String serial;
}
