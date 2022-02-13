package com.atlbb.springcloud.service;

import com.atlbb.springcloud.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiangQingBin
 * @version 1.00
 * @ClassName DeptService
 * @Description TODO
 * @time 2022/2/12 15:57
 */
public interface DeptService {
    public boolean addDept(Dept dept);
    
    public Dept queryById(Long id);
    
    public List<Dept> queryAll();
}
