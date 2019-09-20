package com.spring.mvc;

import com.spring.mvc.entity.UserInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {
    @Test
    public void test01 (){
        ApplicationContext context01 = new ClassPathXmlApplicationContext("/bean-scan-02.xml");
        UserInfo userInfo1 = (UserInfo)context01.getBean("userInfo") ;
        UserInfo userInfo2 = (UserInfo)context01.getBean("userInfo") ;
        System.out.println(userInfo1==userInfo2);
        System.out.println(userInfo1.getName()+";;"+userInfo2.getName());
    }
}
