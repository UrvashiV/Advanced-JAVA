package InsertUsingInterface;

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

        System.out.println( "My program Started." );
        //spring jdbc -> JDBC Template Object
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentdao= context.getBean("studentDao", StudentDao.class);

        student student = new student();
        student.setId(5);
        student.setCity("Simran");
        student.setName("Gurgaon");

        int result= studentdao.insert(student);
        System.out.println("Student Added " + result);
    }
}