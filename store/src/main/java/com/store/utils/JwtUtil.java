package com.store.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Date;


//@ConfigurationProperties("jwt.config")
public class JwtUtil {

    private String key;

    private Long expire;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Long getExpire() {
        return expire;
    }

    public void setExpire(Long expire) {
        this.expire = expire;
    }

    /**
     * 创建一个token
     * @param id 用户ID
     * @param name 用户名称
     * @return
     */
    public String createJwt(String id, String name){
        long now  = System.currentTimeMillis();
        long exp = now + 86400;

        JwtBuilder jwtBuilder = Jwts.builder().setId("123").setSubject("小白")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "abc")
                .setExpiration(new Date(exp));
        String token = jwtBuilder.compact();

        return token;
    }

    /**
     * 解析一个token信息
     * @param token
     * @return
     */
    public Claims parseJwt(String token){
        Claims claims = Jwts.parser().setSigningKey("merchantApi").parseClaimsJws(token).getBody();
        return claims;
    }



}
