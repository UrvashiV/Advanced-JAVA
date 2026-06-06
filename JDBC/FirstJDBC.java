import java.sql.*;
class FirstJDBC
{
public static void main (String args[])
{
try{
 
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/practice";
String username="root";
String password = "Urvc@123*";      

Connection con = DriverManager.getConnection(url,username,password);

if(con.isClosed()){
System.out.println("Connection is closed");
}
else{
System.out.println("Connection is Active");
}

}catch(Exception e){e.printStackTrace();}
}
}
