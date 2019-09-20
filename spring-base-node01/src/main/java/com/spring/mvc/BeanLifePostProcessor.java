package com.spring.mvc;

import com.spring.mvc.entity.BeanLife;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanLifePostProcessor implements BeanPostProcessor {

    // 初始化之前对bean进行增强处理
    @Override
    public Object postProcessBeforeInitialization(Object obj, String beanName) throws BeansException {
        System.out.println("初始化之前..."+beanName);
        return obj ;
    }

    // 初始化之后对bean进行增强处理
    @Override
    public Object postProcessAfterInitialization(Object obj, String beanName) throws BeansException {
        System.out.println("初始化之后..."+beanName);
        // 改写Bean的名称
        if (obj instanceof BeanLife){
            BeanLife beanLife = (BeanLife)obj ;
            beanLife.setBeanName("myBeanLifeTwo");
            return beanLife ;
        }
        return obj ;
    }
}
