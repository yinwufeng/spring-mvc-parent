package com.spring.mvc;

import com.spring.mvc.entity.ByBus;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void test01 (){
        ApplicationContext context = new ClassPathXmlApplicationContext("/ioc-contain-01.xml");
        ByBus byBus = (ByBus) context.getBean("byBus");
        byBus.takeBus();
    }
}
