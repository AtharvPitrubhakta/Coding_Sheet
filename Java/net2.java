/*
For e.g: Chatting Between 2 machines
Client Code:
*/
import java.net.*;
import java.io.*;
import java.util.*;
class net2
{
public static void main(String[] args)
{
try
{
Socket s=new Socket("localhost",5000);//portno
InputStream is=s.getInputStream();
OutputStream os=s.getOutputStream();
DataInputStream dis=new DataInputStream(is);
DataOutputStream dos=new DataOutputStream(os);
Scanner rd=new Scanner(System.in);
while(true)
{
System.out.println("Enter Msg For Server");
String res=rd.nextLine();
dos.writeUTF(res);

String req=dis.readUTF();
if(req.equals("stop"))
break;
System.out.println("Msg From Server "+req);
}
}catch(Exception ee){}
}
}
