package com.wudner.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableEurekaClient
public class Gateway9001 {
    public static void main(String[] args) {
        SpringApplication.run(Gateway9001.class, args);
    }


    public KeyResolver userKeyResolver(){
        return new KeyResolver() {
            @Override
            public Mono<String> resolve(ServerWebExchange exchange) {
                String ip = exchange.getRequest().getRemoteAddress().getHostString();
                return Mono.just(ip);
            }
        };
    }
}
