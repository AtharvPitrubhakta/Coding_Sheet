// Connection Less protocol
// Receiver Code
import java.net.*;
import java.io.*;
class net4
{
public static void main(String[] args)
{
try
{
DatagramSocket ds=new DatagramSocket(7000);
byte b[]=new byte[512];
DatagramPacket dp=new DatagramPacket(b,b.length);
ds.receive(dp);
String s=new String(dp.getData());
System.out.println(s.trim());
ds.close();
}catch(Exception ee){}
}
}