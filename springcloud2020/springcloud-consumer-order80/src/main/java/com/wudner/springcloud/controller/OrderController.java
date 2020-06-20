package com.wudner.springcloud.controller;

import com.wudner.springcloud.model.ApiResult;
import com.wudner.springcloud.model.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    private static final  String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public ApiResult create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create", payment, ApiResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public ApiResult getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id, ApiResult.class);
    }

}
