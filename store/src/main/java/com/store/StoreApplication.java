package com.store;

import com.store.utils.HmacSHA256Util;
import com.store.utils.JwtUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }

    @Bean
    public JwtUtil jwtUtil(){
        return new JwtUtil();
    }

//    @Bean
//    public HmacSHA256Util hmacSHA256Util(){
//        return new HmacSHA256Util();
//    }

}
