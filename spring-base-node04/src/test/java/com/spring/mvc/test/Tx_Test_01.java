package com.spring.mvc.test;

import com.spring.mvc.service.UserAccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tx_Test_01 {

    @Test
    public void test1 (){
        String xmlPath = "spring-jdbc-tx-01.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        UserAccountService accountService = (UserAccountService)
                                    context.getBean("userAccountService");
        accountService.remittance("jack","tom",1000);
    }
}
