// Multi Client and Single Server
// Server Code
import java.net.*;
import java.io.*;
import java.util.*;
class net5
{
public static void main(String[] args)
{
try
{
ServerSocket ss=new ServerSocket(12000);
while(true)
{
Socket s=ss.accept();
MyThread m=new MyThread(s);
Thread t=new Thread(m);
t.start();
}
}catch(Exception ee){}
}
}

class MyThread implements Runnable
{
Socket s;
public MyThread(Socket sss)
{
s=sss;
}
public void run()
{
try
{
try
{
InputStream is=s.getInputStream();
OutputStream os=s.getOutputStream();
DataInputStream dis=new DataInputStream(is);
DataOutputStream dos=new DataOutputStream(os);
Scanner rd=new Scanner(System.in);
while(true)
{
String req=dis.readUTF();
if(req.equals("angry"))
break;
System.out.println("Msg From Client "+req);
System.out.println("Enter Msg For Client");
String res=rd.nextLine();
dos.writeUTF(res);
}
}finally
{
s.close();
}
}catch(Exception ee){}
}
}
