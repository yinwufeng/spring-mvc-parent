package com.spring.mvc.entity;

public class Employee {
    private String name ;
    private int id ;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Employee(){
        System.out.println("无参构造函数！");
    }
    public Employee(String name){
        this.name = name;
        System.out.println("带参数构造函数！");
    }
    public Employee(String name,int id){
        System.out.println("两个参数的构造函数");
        this.name=name;
        this.id=id;
    }
}

