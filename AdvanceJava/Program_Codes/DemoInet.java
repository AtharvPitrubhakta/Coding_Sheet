/*
14] Develop a program using InetAddress class to retrieve IP address of computer when hostname is entered by the user.
*/

import java.net.*;

class DemoInet
{
	public static void main(String args[])throws UnknownHostException 
	{
		InetAddress adrs=InetAddress.getByName("www.gmail.com");

		String hostnm=adrs.getHostName();
		String ip=adrs.getHostAddress();

		System.out.println("Host name:"+hostnm);
		System.out.println("Host Address:"+ip);
		
	}
}
