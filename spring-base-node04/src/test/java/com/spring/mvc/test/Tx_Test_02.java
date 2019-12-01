package com.spring.mvc.test;

import com.spring.mvc.service.UserAccountService01;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tx_Test_02 {

    @Test
    public void test1 (){
        String xmlPath = "spring-jdbc-tx-02.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        UserAccountService01 accountService = (UserAccountService01)
                                    context.getBean("proxyAccountService");
        accountService.remittance("jack","tom",1000);
    }
}
