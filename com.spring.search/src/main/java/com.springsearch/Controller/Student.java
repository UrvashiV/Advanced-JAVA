package com.springsearch.Controller;



import java.util.Date;
import java.util.List;

public class Student {

    private String name;
    private Long id;
    private Date dob;
    private List<String> course;
    private String textArea;

    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public List<String> getCourse() {
        return course;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    public String getTextArea() {
        return textArea;
    }

    public void setTextArea(String textArea) {
        this.textArea = textArea;
    }

    public Student() {
    }

    public Student(String name, Long id, Date dob, List<String> course, String textArea) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.course = course;
        this.textArea = textArea;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dob=" + dob +
                ", course=" + course +
                ", textArea='" + textArea + '\'' +
                ", address=" + address +
                '}';
    }
}
