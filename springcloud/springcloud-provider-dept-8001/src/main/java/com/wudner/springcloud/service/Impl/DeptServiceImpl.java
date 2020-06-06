package com.wudner.springcloud.service.Impl;

import com.wudner.springcloud.dao.DeptDao;
import com.wudner.springcloud.pojo.Dept;
import com.wudner.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptMapper;

    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    public Dept queryById(long id) {
        return deptMapper.queryById(id);
    }

    public List<Dept> queryAll() {
        return deptMapper.queryAll();
    }
}
