package com.spring.mvc;

import com.spring.mvc.entity.Department;
import com.spring.mvc.entity.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Map;
import java.util.Properties;

public class Test05 {
    @Test
    public void test01 (){
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean-value-03.xml");
        Department department = (Department) context.getBean("department");
        System.out.println(department.getName());
        System.out.println("--------------------->String数组");
        for (String str : department.getEmpName()){
            System.out.println(str);
        }
        System.out.println("--------------------->List集合");
        for (Employee smp : department.getEmpList()){
            System.out.println(smp.getId()+":"+smp.getName());
        }
        System.out.println("--------------------->Set集合");
        for (Employee emp : department.getEmpSet()){
            System.out.println(emp.getId()+":"+emp.getName());
        }
        System.out.println("--------------------->Map集合");
        for (Map.Entry<String, Employee> entry : department.getEmpMap().entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue().getName());
        }
        System.out.println("--------------------->Properties");
        Properties pp = department.getPp();
        System.out.println(pp.get("pp1"));
        System.out.println(pp.get("pp2"));
    }
}
