package com.wudner.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulService9528 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulService9528.class, args);
    }
}
