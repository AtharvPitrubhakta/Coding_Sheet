// Prepared Statement - To delete Record
import java.sql.*;
import java.util.*;
public class jdbc7
{
public static void main(String[] args)
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection cn=DriverManager.getConnection("Jdbc:Odbc:mydsn1","","");
PreparedStatement pst=cn.prepareStatement("delete from be where rollno=?");
Scanner s=new Scanner(System.in);
String ans="";
do
{
System.out.println("Enter Rollno");
int r=s.nextInt();
s.nextLine();
pst.setInt(1,r);
int k=pst.executeUpdate();
System.out.println("Delete Delete more");
ans=s.nextLine();
}while(ans.equalsIgnoreCase("yes"));
}catch(Exception ee){}
}
}
