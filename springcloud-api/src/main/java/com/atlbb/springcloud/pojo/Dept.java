package com.atlbb.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author LiangQingBin
 * @version 1.00
 * @ClassName Dept
 * @Description TODO
 * @time 2022/2/12 15:06
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)  //链式写法  new Dept().setxx().setXX()
public class Dept implements Serializable { //Dept实体类  orm  类表关系映射
    private Long deptno;
    private String dname;
    //一个
    private String db_source;
    
    public Dept(String dname){
        this.dname = dname;
    }
    
    
}
