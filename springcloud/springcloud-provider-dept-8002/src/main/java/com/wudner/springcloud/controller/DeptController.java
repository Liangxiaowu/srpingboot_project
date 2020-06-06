package com.wudner.springcloud.controller;

import com.wudner.springcloud.pojo.Dept;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @GetMapping("/dept/test")
    public Dept test(){
        Dept dept = new Dept();
        dept.setDname("8002").setDeptno(100l).setDb_source("db2");
        return dept;
    }

}
