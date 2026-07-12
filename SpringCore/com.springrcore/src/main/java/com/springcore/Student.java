package com.springcore;

public class Student {
    private int studentId;
    private String studentName;
    private String StudentAddress;

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentAddress() {
        return StudentAddress;
    }
    public void setStudentAddress(String studentAddress) {
        this.StudentAddress = studentAddress;
    }
    public Student(int studentId, String studentName, String StudentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.StudentAddress = StudentAddress;

    }
    public Student() {
        super();
    }
    public String toString(){
        return "Student [studentId=" + studentId + ", studentName=" + studentName
                + ", StudentAddress=" + StudentAddress + "]";
    }

}
