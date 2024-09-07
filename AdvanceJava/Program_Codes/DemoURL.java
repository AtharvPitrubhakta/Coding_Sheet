/*		Practical No-15
1] Write a program using URL class to retrieve the host, protocol, port and file of URL http://www.msbte.org.in.
*/

import java.net.*;
class DemoURL
{
	public static void main(String args[])throws MalformedURLException 
	{
		URL hp=new URL("http://www.msbte.org.in");
	
		String p=hp.getProtocol();
		String host=hp.getHost();
		int port=hp.getPort();
		String path=hp.getFile();

		System.out.println("Protocol:"+p);
		System.out.println("Host Name:"+host);
		System.out.println("Port:"+port);
		System.out.println("File Path:"+path);

	}
}


