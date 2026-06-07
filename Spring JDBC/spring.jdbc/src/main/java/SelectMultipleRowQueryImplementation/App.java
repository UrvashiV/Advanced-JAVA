package SelectMultipleRowQueryImplementation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
*/
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "My program Started." );
        //spring jdbc -> JDBC Template Object
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentdao= context.getBean("multiplestudentDao", StudentDao.class);

        /* insert
        student student = new student();
        student.setId(5);
        student.setCity("Simran");
        student.setName("Gurgaon");

        int result= studentdao.insert(student);
        System.out.println("Student Added " + result);

        Update...


        student student = new student();
        student.setId(6);
        student.setCity("Kanpur");
        student.setName("Komal");
        int result= studentdao.change(student);
        System.out.println("Record updated..." + result);


        delete
        int result = studentdao.delete(5);
        System.out.println(result + " row deleted.");

        single row result set
        student student = studentdao.getStudent(3);
        System.out.println(student);

         */
        List<student> student = studentdao.getAllStudents();
        for(student s: student){
            System.out.println(s);
        }


    }
}