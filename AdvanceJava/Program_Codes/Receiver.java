/*		Practical No: 17_1

1] Program to demonstrate use of DatagramSocket and DatagramPacket.
*/

import java.net.*;
import java.io.*;

class Receiver
{
	public static void main(String args[])throws IOException ,UnKnownHostException 
	{
		DatagramSocket ds=new DatagramSocket(1520);
		
		byte b[]=new byte[500];	
		DatagramPacket dp=new DatagramPacket(b,b.length);

		System.out.println("Reciever is waiting....");
		ds.receive(dp);
		String msg=new String(dp.getData());
		System.out.println("Sender Says: "+msg.trim());
		

		ds.close();
	}
}