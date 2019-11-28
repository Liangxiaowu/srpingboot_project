package com.store;

import com.store.utils.HmacSHA256Util;
import com.store.utils.JwtPhpUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 权限验证拦截器
 */
@Component
public class HandlerInterceptor implements org.springframework.web.servlet.HandlerInterceptor {

    // 目标方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws  Exception{
        // token验证
        String authorization = request.getHeader("Authorization");
        String token = authorization.replace("Bearer ", "");
        String[] tokens = token.split("\\.");   // 截取token的信息源

        // 兼容php的jwt验证
        if(JwtPhpUtil.Verification(tokens)){
            // 验证通过

        }else {
            System.out.println("登录失败需要回滚一个错误信息");
            return false;
        }
        System.out.println("到拦截器了");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

    }

}
