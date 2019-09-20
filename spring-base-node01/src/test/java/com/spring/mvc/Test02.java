package com.spring.mvc;

import com.spring.mvc.service.InfoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
    @Test
    public void test01 (){
        ApplicationContext context01 = new ClassPathXmlApplicationContext("/bean-scan-01.xml");
        InfoService infoService = (InfoService)context01.getBean("infoService") ;
        InfoService infoService2 = (InfoService)context01.getBean("infoService") ;
        infoService.printName("smile");
        System.out.println(infoService==infoService2);
    }
}
