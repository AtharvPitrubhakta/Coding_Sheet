// ResultSet Meta Data - To Display Structure of the table
import java.sql.*;
class jdbc8
{
public static void main(String[] args)
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("Jdbc:Odbc:mydsn1","","");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from be");
ResultSetMetaData rsmd=rs.getMetaData();
for(int i=1;i<=rsmd.getColumnCount();i++)
{
System.out.println("Column Name "+rsmd.getColumnName(i));
System.out.println("Column Type "+rsmd.getColumnTypeName(i));
System.out.println("Column Size "+rsmd.getColumnDisplaySize(i));
}

}catch(Exception ee){}
}
}
