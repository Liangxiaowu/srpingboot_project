package com.store.controller;

import com.store.utils.HmacSHA256Util;
import com.store.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/index")
public class IndexController {

//    @Autowired
//    private FanweVoiceBoxesService fanweVoiceBoxesService;

    @Autowired
    private JwtUtil jwtUtil;
//
//    @RequestMapping("/list")
//    public List<FanweVoiceBoxes> test(){
//        return fanweVoiceBoxesService.selectAll();
//    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody Map<String, Object> reqMap) {

        // 登录验证
        System.out.println(reqMap.get("loginName").toString());
        System.out.println(reqMap.get("password"));

        // 创建token
        String token = jwtUtil.createJwt("123", "xiaowu");


        return token;
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String info() {
//        public Claims info(){
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vdGVzdC5hcGkuc3VwcGxpZXIudGRpYW55aS5jb20vdjMvbG9naW4iLCJpYXQiOjE1NzQ4MzYzMjEsImV4cCI6MTU3NDkyNjMyMSwibmJmIjoxNTc0ODM2MzIxLCJqdGkiOiJEMnc5Z3F3RmNKTFExcG5QIiwic3ViIjo3MDksInBydiI6IjAyOWUwYzIyZDNkZTA1NzA4ZmFlNDZhZmYzNzMwZDhlMDYyYWNjOTEiLCJwYXJ0eV9pZCI6NjE4MX0";
        String bearer = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vdGVzdC5hcGkuc3VwcGxpZXIudGRpYW55aS5jb20vdjMvbG9naW4iLCJpYXQiOjE1NzQ4MzYzMjEsImV4cCI6MTU3NDkyNjMyMSwibmJmIjoxNTc0ODM2MzIxLCJqdGkiOiJEMnc5Z3F3RmNKTFExcG5QIiwic3ViIjo3MDksInBydiI6IjAyOWUwYzIyZDNkZTA1NzA4ZmFlNDZhZmYzNzMwZDhlMDYyYWNjOTEiLCJwYXJ0eV9pZCI6NjE4MX0";

//        HmacUtil.getSignature(bearer, "merchantApi");

//        String[] temp1;
//        String delimeter1 = "\\.";  // 指定分割字符， . 号需要转义
//        temp1 = token.split(delimeter1); // 分割字符串
        String  signUp = HmacSHA256Util.Created("merchantApi", bearer);
//        System.out.println(signUp);
//        // 第三段信息处理
        String tokenEndString = "wlknQfKblxEKdsYlS680UJ-N4cTaV3VFBLg1X_Jvmlk";
//        tokenEndString = tokenEndString.replace("-", "+");
//        tokenEndString = tokenEndString.replace("_", "/");
//        byte[] base64Bytes = Base64.getDecoder().decode(tokenEndString);

//        byte[] bt;
//        try {
//            bt = (new BASE64Decoder()).decodeBuffer(tokenEndString);
//            return new String(bt,"utf-8");//如果出现乱码可以改成： String(bt, "utf-8")或 gbk
//        } catch (IOException e) {
//            e.printStackTrace();
//            return "";
//        }
        return "";
    }



}
