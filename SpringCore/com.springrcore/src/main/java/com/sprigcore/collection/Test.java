package com.sprigcore.collection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee emp = (Employee)context.getBean("emp1");
        //System.out.println(emp);
        System.out.println(emp.getName());
        System.out.println(emp.getAddresses());
        System.out.println(emp.getPhoneNumbers());
        System.out.println(emp.getCourses());

    }


}
