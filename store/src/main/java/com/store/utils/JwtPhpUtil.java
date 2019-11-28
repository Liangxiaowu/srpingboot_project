package com.store.utils;

import com.alibaba.fastjson.JSON;
import org.json.JSONArray;
import org.json.JSONObject;
import sun.misc.BASE64Decoder;

import java.io.IOException;

public class JwtPhpUtil {
    public static Boolean Verification(String[] tokens) {
        if(tokens.length == 3){
            // 验证token信息
            String bearer = tokens[0]+"."+tokens[1]; // 拼接第一段信息和第二段的信息源
            String  signUp = HmacSHA256Util.Created("merchantApi", bearer);
            // 处理返回字符串
            String s1 = signUp.replace("+", "-");
            String s2 = s1.replace("/", "_");
            String s3 = s2.substring(0,s2.length()-1);
            // 字符信息验证
            if(!s3.equals(tokens[2])){
                return false;
            }

            // 用户信息源
            byte[] bt;
            try {
                bt = (new BASE64Decoder()).decodeBuffer(tokens[1]);
                String btString = new String(bt,"utf-8");
                btString = btString.substring(0,btString.length()-1);
                JSON.parseObject(btString);
                System.out.println(btString);
                System.out.println(JSON.parseObject(btString));
//                return new String(bt,"utf-8");//如果出现乱码可以改成： String(bt, "utf-8")或 gbk
            } catch (IOException e) {
               return false;
            }

            // 时间验证

            // 用户验证
        }


        return false;
    }


}
