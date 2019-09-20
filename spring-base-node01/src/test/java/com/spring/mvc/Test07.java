package com.spring.mvc;

import com.spring.mvc.entity.Grade;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test07 {
    @Test
    public void test01 (){
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean-value-05.xml");
        Grade grade = (Grade) context.getBean("grade");
        /* Summer;0;大学  */
        System.out.println(grade.getName()+";"+grade.getAge()+";"+grade.getDegree());
    }
}
