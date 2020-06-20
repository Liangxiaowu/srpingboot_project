package com.wudner.springcloud.service;

import com.wudner.springcloud.model.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
