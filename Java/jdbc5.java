// Prepared Statement - To Insert Record
import java.sql.*;
import java.util.*;
public class jdbc5
{
public static void main(String[] args)
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection cn=DriverManager.getConnection("Jdbc:Odbc:mydsn1","","");
PreparedStatement pst=cn.prepareStatement("insert into be values(?,?)");
Scanner s=new Scanner(System.in);
String ans="";
do
{
System.out.println("Enter Rollno");
int r=s.nextInt();
s.nextLine();
System.out.println("Enter Name");
String nm=s.nextLine();
pst.setInt(1,r);
pst.setString(2,nm);
int k=pst.executeUpdate();
System.out.println("Record Saved Add more");
ans=s.nextLine();
}while(ans.equalsIgnoreCase("yes"));
}catch(Exception ee){}
}
}
