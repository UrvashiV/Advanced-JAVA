package com.spring.orm;

import com.spring.dao.StudentDao;
import com.spring.entites.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao= context.getBean("studentDao", StudentDao.class);
        Student student = new Student(234, "Urvashi","Gurgaon");
        int result = studentDao.insertStudent(student);
        System.out.println("Done" + result);


    }

}
