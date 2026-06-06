import java.sql.*;
class InsertJDBC
{
public static void main (String args[])
{
  try{
 
  Class.forName("com.mysql.cj.jdbc.Driver");
  String url = "jdbc:mysql://localhost:3306/practice";
  String username="root";
  String password = "Urvc@123*";      

  Connection con = DriverManager.getConnection(url,username,password);

  String q = "create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
  Statement stmt = con.createStatement();
  stmt.executeUpdate(q);
  System.out.println("Table created in DataBase");
  con.close();

   }catch(Exception e){e.printStackTrace();}
}
}
