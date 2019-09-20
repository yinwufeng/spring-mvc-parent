package com.spring.mvc;

import com.spring.mvc.entity.BeanLife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test08 {
    /**
     * 测试输出结果
     * 1、设置名称：myBeanLifeOne
     * 2、BeanNameAware..SetName：beanLife
     * 3、初始化之前...beanLife
     * 4、初始化Bean..
     * 5、初始化之后...beanLife
     * 6、BeanNameAware..SetName：myBeanLifeTwo
     * 7、测试结果BeanLife：myBeanLifeOne
     * 8、使用Bean..
     * 9、销毁Bean..
     */
    @Test
    public void test01 (){
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean-value-06.xml");
        BeanLife beanLife = (BeanLife) context.getBean("beanLife");
        System.out.println("测试结果BeanLife："+beanLife.getName()) ;
        beanLife.useBean();
        // 关闭容器
        ((AbstractApplicationContext) context).close();
    }
}
