package com.spring.dao;

import com.spring.entites.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;

public class StudentDao {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public int insertStudent(Student student)
    {
        int i = (int)this.hibernateTemplate.save(student);
        return i;
    }


}
