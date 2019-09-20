package com.spring.mvc.entity;

import org.springframework.beans.factory.BeanNameAware;

public class BeanLife implements BeanNameAware {

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("设置名称："+name);
        this.name = name;
    }

    @Override
    public void setBeanName(String value) {
        System.out.println("BeanNameAware..SetName："+value);
    }

    public void initBean() {
        System.out.println("初始化Bean..");
    }

    public void destroyBean() {
        System.out.println("销毁Bean..");
    }

    public void useBean() {
        System.out.println("使用Bean..");
    }

    @Override
    public String toString() {
        return "BeanLife [name = " + name + "]";
    }
}
