package com.wudner;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;

@SpringBootTest
public class JwtTest {

    // 自定义秘钥
    private final static String KEY="wudner";

    @Test
    public void testCreate(){

        // 构建对象
        JwtBuilder builder = Jwts.builder();

        // 发布ID
        builder.setId("100");
        // 发布人
        builder.setIssuer("wudner");

        // 发布时间
        builder.setIssuedAt(new Date());

        // 过期时间 一分钟
        builder.setExpiration(new Date(System.currentTimeMillis() + 60000));

        // 信息体
        builder.setSubject("测试信息");

        // 自定义载荷
        HashMap<String, Object> info = new HashMap<String, Object>();
        info.put("name", "wudner");
        info.put("age", 18);
        builder.addClaims(info);


        // 签名算法   KEY: 自定义秘钥
        builder.signWith(SignatureAlgorithm.HS256, KEY);

        //密文
        String token = builder.compact();

        System.out.println(token);
    }

    @Test
    public void testParse(){

        String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxMDAiLCJpc3MiOiJ3dWRuZXIiLCJpYXQiOjE1OTE2ODk3OTgsImV4cCI6MTU5MTY4OTg1OCwic3ViIjoi5rWL6K-V5L-h5oGvIiwibmFtZSI6Ind1ZG5lciIsImFnZSI6MTh9.wJlKr4Zv351ofN5FlqzEg3bANATmSv93vnFu19wuSXA";

        Claims body = Jwts.parser()
                .setSigningKey(KEY)     // 秘钥
                .parseClaimsJws(token)  // 令牌
                .getBody();             // 解析后的对象

        System.out.println(body.toString());


    }

}
