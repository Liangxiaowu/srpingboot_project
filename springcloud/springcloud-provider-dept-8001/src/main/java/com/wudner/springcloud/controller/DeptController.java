package com.wudner.springcloud.controller;

import com.wudner.springcloud.pojo.Dept;
import com.wudner.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/dept/test")
    public Dept test(){
        Dept dept = new Dept();
        dept.setDname("8001").setDeptno(100l).setDb_source("db1");
        return dept;
    }

//    @PostMapping("/dept/add")
//    public boolean addDept(Dept dept){
//        return deptService.addDept(dept);
//    }
//
//    @GetMapping("/dept/get/{id}")
//    public Dept get(@PathVariable("id") Long id){
//        return deptService.queryById(id);
//    }
//
//    @GetMapping("/dept/list")
//    public List<Dept> queryAll(){
//
//        Dept dept = new Dept();
//        dept.setDb_source("01");
//        dept.setDeptno(1l);
//        dept.setDname("测试");
//        ArrayList<Dept> objects = new ArrayList();
//        objects.add(dept);
//
//        return objects;
//    }
//
//
//    @GetMapping("/dept/discovery")
//    public Object discovery(){
//        // 获取服务器列表清单
//        List<String> services = client.getServices();
//        System.out.println(services);
//
//        // 得到一个微服务信息 通过具体的服务ID applicaioinName
//        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER");
//
//        for (ServiceInstance instance : instances) {
//            System.out.println(
//                    instance.getHost()+"\t"+
//                    instance.getPort()+"\t"+
//                    instance.getUri()+"\t"+
//                    instance.getServiceId()
//            );
//        }
//
//        return this.client;
//    }
}
