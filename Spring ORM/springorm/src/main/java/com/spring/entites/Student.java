package com.spring.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {

    @Id
    @Column(name = "student_id")
    private int StudentID;
    @Column(name = "student_name")
    private String StudentName;
    @Column(name = "student_city")
    private String StudentCity;

    public Student(int studentID, String studentName, String studentCity) {
        super();
        this.StudentID = studentID;
        this.StudentName = studentName;
        this.StudentCity = studentCity;
    }
    public Student() {}

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentCity() {
        return StudentCity;
    }

    public void setStudentCity(String studentCity) {
        StudentCity = studentCity;
    }
}
