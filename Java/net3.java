// Connection Less protocol
// sender Code
import java.net.*;
import java.io.*;
class net3
{
public static void main(String[] args)
{
try
{
DatagramSocket ds=new DatagramSocket(6000);
String x="Baba is very Angry, he shut the window very hardly";
byte b[]=x.getBytes();
InetAddress ia=InetAddress.getLocalHost();
DatagramPacket dp=new DatagramPacket(b,b.length,ia,7000);
ds.send(dp);
ds.close();
}catch(Exception ee){}
}
}