// server code
import java.net.*;
import java.io.*;
import java.sql.*;
public class net8
{
public static void main(String[] args)
{
try
{
ServerSocket ss=new ServerSocket(7500);
Socket s=ss.accept();
InputStream is=s.getInputStream();
OutputStream os=s.getOutputStream();
DataInputStream dis=new DataInputStream(is);
DataOutputStream dos=new DataOutputStream(os);
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("Jdbc:Odbc:mydsn","","");
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs=st.executeQuery("select * from student");
while(true)
{
String found="Not Exist:Not Applicable";
int stno=Integer.parseInt(dis.readUTF());
rs.first();
do
{
if(rs.getInt("Seatno")==stno)
{
found=rs.getString("StudName")+":"+rs.getFloat("StudPer");
break;
}
}while(rs.next());
dos.writeUTF(found);
}
}catch(Exception ee){}
}
}