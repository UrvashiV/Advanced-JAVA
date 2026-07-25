package com.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autoconfig.xml");
        Emp emp1=  context.getBean("emp", Emp.class);
        System.out.println(emp1);
    }

}
