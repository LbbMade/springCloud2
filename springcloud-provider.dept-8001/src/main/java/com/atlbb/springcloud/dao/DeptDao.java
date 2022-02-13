package com.atlbb.springcloud.dao;

import com.atlbb.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LiangQingBin
 * @version 1.00
 * @ClassName DeptDao
 * @Description TODO
 * @time 2022/2/12 15:44
 */
@Mapper
@Repository
public interface DeptDao {
    public boolean addDept(Dept dept);
    
    public Dept queryById(Long id);
    
    public List<Dept> queryAll();
}
