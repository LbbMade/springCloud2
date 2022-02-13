package com.atlbb.springcloud.service;

import com.atlbb.springcloud.dao.DeptDao;
import com.atlbb.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiangQingBin
 * @version 1.00
 * @ClassName DeptServiceImpl
 * @Description TODO
 * @time 2022/2/12 15:58
 */
@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    DeptDao deptDao;
    
    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }
    
    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }
    
    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
