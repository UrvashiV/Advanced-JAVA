package ConnectionUsingJdbcConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentdao= context.getBean("studentDao", StudentDao.class);

        //insert
        student student = new student();
       /* student.setId(5);
        student.setCity("Gurgaon");
        student.setName("Hardik");

        int result= studentdao.insert(student);
        System.out.println("Student Added " + result);
        */
        //Update...

        student.setId(7);
        student.setCity("Gurgaon");
        student.setName("Ram");
        int result1= studentdao.change(student);
        System.out.println("Record updated..." + result1);


      //  delete
       // int result2 = studentdao.delete(5);
      //  System.out.println(result2 + " row deleted.");

        /* single row result set
        studentdao.getStudent(3);
        System.out.println(student);


       List<student> student = studentdao.getAllStudents();
        for(student s: student){
            System.out.println(s);
        }
                */


    }
}