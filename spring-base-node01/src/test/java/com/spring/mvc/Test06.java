package com.spring.mvc;

import com.spring.mvc.entity.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test06 {
    @Test
    public void test01 (){
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean-value-04.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee.getId()+":"+employee.getName());
    }
}
