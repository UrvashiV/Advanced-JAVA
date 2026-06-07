import java.sql.*;
class UpdateJDBC
{
public static void main (String args[])
{
  try{
 
  Class.forName("com.mysql.cj.jdbc.Driver");
  String url = "jdbc:mysql://localhost:3306/practice";
  String username="root";
  String password = "";      

  Connection con = DriverManager.getConnection(url,username,password);

  String q = "insert into table1(tName,tCity) values (?,?)";
  PreparedStatement pstmt = con.prepareStatement(q);
  pstmt.setString(1,"Roshini Verma");
  pstmt.setString(2,"Goa");

  pstmt.executeUpdate();
  System.out.println("Inserted....");
  
  con.close();

   }catch(Exception e){e.printStackTrace();}
}
}
