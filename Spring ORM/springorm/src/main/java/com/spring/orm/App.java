package com.spring.orm;

import com.spring.dao.StudentDao;
import com.spring.entites.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.List;

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
       // Student student = new Student(235, "Urvashi","Gurgaon");
      //  int result = studentDao.insertStudent(student);
      //  System.out.println("Done " + result);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go = true;
        while(go){
            System.out.println("----------------Welcome to the Application---------------/n");
            System.out.println("Press 1 for add new student");
            System.out.println("Press 2 for update student");
            System.out.println("Press 3 for delete student");
            System.out.println("Press 4 for find any student");
            System.out.println("Press 5 for find all student");
            System.out.println("Press 6 for exit");

            try{
                int input = Integer.parseInt(br.readLine());

                switch (input){
                    case 1:
                        System.out.println("Enter Student ID");
                        int studentID = Integer.parseInt(br.readLine());
                        System.out.println("Enter Student Name");
                        String studentName = br.readLine();
                        System.out.println("Enter Student City");
                        String studentCity = br.readLine();
                        Student student = new Student(studentID,studentName,studentCity);
                        studentDao.insertStudent(student);
                        System.out.println("Student added successfully");
                        break;
                    case 2:
                        System.out.println("Please enter the StudentID, you want update ");
                        int updateID = Integer.parseInt(br.readLine());
                        Student student1 = studentDao.getStudent(updateID);
                        if(student1 != null) {
                            System.out.println("Enter the Student name ");
                            student1.setStudentName(br.readLine());
                            System.out.println("Enter the Student city ");
                            student1.setStudentCity(br.readLine());
                            studentDao.updateStudent(student1);
                            System.out.println("Student record updated successfully");
                        } else{
                            System.out.println("Student ID not found.");
                        }
                        break;
                    case 3:
                        System.out.println("Please enter the StudentID, you want Delete ");
                        int deleteID = Integer.parseInt(br.readLine());
                        Student student2 = studentDao.getStudent(deleteID);
                        if(student2 != null) {
                            studentDao.deleteStudent(student2);
                            System.out.println("Student record deleted successfully");
                        }
                        else{
                            System.out.println("Student ID not found.");
                        }
                           break;
                    case 4:
                        System.out.println("Please enter the StudentID, you want Find ");
                        int findID = Integer.parseInt(br.readLine());
                        Student student3 = studentDao.getStudent(findID);
                        if(student3 != null) {

//                            System.out.println("Student ID   : " + student3.getStudentID());
//                            System.out.println("Student Name : " + student3.getStudentName());
//                            System.out.println("Student City : " + student3.getStudentCity());
                            System.out.println(student3);
                            System.out.println("Student record found successfully ");

                        }
                        else{
                            System.out.println("Student ID not found.");
                        }
                        break;
                    case 5:
                        System.out.println("These are the all student details :  ");
                        List<Student> student4 = studentDao.getAllStudents();
                        System.out.println(student4);
                        System.out.println("\nStudent records found successfully ");

                        break;
                    case 6:
                           go= false;
                           break;


                }

            } catch(Exception e){
                System.out.println("Invalid Input, please try again");
                System.out.println(e.getMessage());
            }

        }
        System.out.println("Thank you!!");

    }

}
