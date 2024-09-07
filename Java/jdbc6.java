// Prepared Statement - To Update Record
import java.sql.*;
import java.util.*;
public class jdbc6
{
public static void main(String[] args)
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection cn=DriverManager.getConnection("Jdbc:Odbc:mydsn1","","");
PreparedStatement pst=cn.prepareStatement("update be set studname=? where rollno=?");
Scanner s=new Scanner(System.in);
String ans="";
do
{
System.out.println("Enter Rollno");
int r=s.nextInt();
s.nextLine();
System.out.println("Enter Name");
String nm=s.nextLine();
pst.setString(1,nm);
pst.setInt(2,r);
int k=pst.executeUpdate();
System.out.println("Updated Update more");
ans=s.nextLine();
}while(ans.equalsIgnoreCase("yes"));
}catch(Exception ee){}
}
}
