package InsertIntoDatabase;

import InsertUsingInterface.StudentDao;
import InsertUsingInterface.student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

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
        JdbcTemplate Template =  context.getBean("jdbcTemplate",JdbcTemplate.class);

        String query ="Insert into student(id,name,city) values (?,?,?)";

        int result =Template.update(query,6,"Kiran","Bhopal");
        System.out.println("Record Inserted..."+result);
    }
}