/*
Networking: Connecting machine and executing code through them.
	There are 2 ways:
	a) Connection Oriented
	b) Connection Less

a) Connection Oriented - TCP/IP
	ServerSocket
	Socket
For e.g: Chatting Between 2 machines
Server Code:
*/
import java.net.*;             
import java.io.*;
import java.util.*;
class net1
{
public static void main(String[] args)
{
try
{
ServerSocket ss=new ServerSocket(5000);//portno
Socket s=ss.accept();
InputStream is=s.getInputStream();
OutputStream os=s.getOutputStream();
DataInputStream dis=new DataInputStream(is);
DataOutputStream dos=new DataOutputStream(os);
Scanner rd=new Scanner(System.in);
while(true)
{
String req=dis.readUTF();
if(req.equals("stop"))
break;
System.out.println("Msg From Client "+req);
System.out.println("Enter Msg For Client");
String res=rd.nextLine();
dos.writeUTF(res);
}
}catch(Exception ee){}
}
}
 