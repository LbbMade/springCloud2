package com.atlbb.springcloud.controller;

import com.atlbb.springcloud.pojo.Dept;
import com.atlbb.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author LiangQingBin
 * @version 1.00
 * @ClassName DeptController
 * @Description TODO 提供Restful风格服务  @RequestBody是接收来自前端的JSON数据；而@ResponseBody 是服务器向前端返回JSON数据
 * @time 2022/2/12 16:01
 */
@RestController
public class DeptController {
    @Autowired
    DeptService deptService;
    
    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }
    
    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id){
        return deptService.queryById(id);
    }
    
    @GetMapping("/dept/list")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }
}
