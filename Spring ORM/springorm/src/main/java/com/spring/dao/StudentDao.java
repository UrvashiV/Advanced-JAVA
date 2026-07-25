package com.spring.dao;

import com.spring.entites.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

public class StudentDao {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    //save the data
    public int insertStudent(Student student)
    {
        int i = (int)this.hibernateTemplate.save(student);
        return i;
    }
    //get the single data
    public Student getStudent(int studentID){
        Student student= this.hibernateTemplate.get(Student.class,studentID);
        return student;
    }

    //get all student data
    public List<Student> getAllStudents(){

       List<Student> students= this.hibernateTemplate.loadAll(Student.class);
       return students;
    }
    // delete the record
    @Transactional
    public void deleteStudent(Student student){
        //Student dltStudent=this.hibernateTemplate.get(Student.class,studentID);
        this.hibernateTemplate.delete(student);

    }
    //update the record
    @Transactional
    public void updateStudent(Student student){
        this.hibernateTemplate.update(student);
    }


}
