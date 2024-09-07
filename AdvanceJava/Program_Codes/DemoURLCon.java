import java.net.*;
import java.io.*;
import java.util.*;

class DemoURLCon
{
	public static void main(String args[])throws MalformedURLException, IOException 
	{
		URL hp=new URL("http://www.ctfda.org./html/fusion.css");

		URLConnection con=hp.openConnection();
	
		System.out.println("Content Type: "+con.getContentType());
		System.out.println("Content Length: "+con.getContentLength());
		System.out.println("Content Encoding: "+con.getContentEncoding());
	
		Date d1=new Date(con.getLastModified());
		System.out.println("Last Modified Date: "+d1.toString());
		
		Date d2=new Date(con.getExpiration());
		System.out.println("Expiration Date: "+d2.toString());

		DataInputStream d=new DataInputStream(con.getInputStream());
		int ch;
		while((ch=d.read()) !=-1)
	 	System.out.print((char)ch);
	}	
}