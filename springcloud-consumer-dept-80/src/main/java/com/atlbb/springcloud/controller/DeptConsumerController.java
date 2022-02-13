package com.atlbb.springcloud.controller;

import com.atlbb.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@CrossOrigin
@RestController
public class DeptConsumerController {
    @Autowired
    RestTemplate restTemplate;
    /**
     * 消费者不应该有service层， 使用restTemplate直接调用
     *
     */

    private static final String REST_URL_PREFIX = "http://localhost:8001";


    @RequestMapping("consumer/dept/add ")
    public boolean add( Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add" , dept ,Boolean.class);
    }

    @RequestMapping("consumer/dept/get/{id}")
    public Dept getById(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/"+ id,Dept.class);
    }

    @RequestMapping("consumer/dept/list")
    public List<Dept> getAll(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list",List.class);
    }

}
