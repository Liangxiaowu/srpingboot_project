package com.wudner.springcloud.controller;

import com.wudner.springcloud.model.ApiResult;
import com.wudner.springcloud.model.Payment;
import com.wudner.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    // 服务发现
    @Resource
    private DiscoveryClient discoveryClient;


    @PostMapping(value = "/payment/create")
    public ApiResult create(@RequestBody Payment payment){

        int result = paymentService.create(payment);

        log.info("====  插入成功  ===="+result);

        if (result > 0){
            return new ApiResult(0, "OK:"+serverPort, result);
        }else{
            return new ApiResult(1, "fail", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public ApiResult getPaymentById(@PathVariable("id") Long id){

        Payment payment = paymentService.getPaymentById(id);

        log.info("====  查询成功  ===="+payment);

        if (payment != null){
            return new ApiResult(0, "OK:"+serverPort, payment);
        }else{
            return new ApiResult(1, "fail", null);
        }
    }


    // 服务发现
    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("==================service:"+service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");// 所有服务
        for (ServiceInstance instance : instances) {
            log.info("==================instance"+instances);
        }

        return this.discoveryClient;
    }

}
