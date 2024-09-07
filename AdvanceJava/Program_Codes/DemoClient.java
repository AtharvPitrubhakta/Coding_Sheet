import java.net.*;
import java.io.*;

class DemoClient
{
	public static void main(String args[])throws IOException
	{
		DataInputStream dis, d;
		DataOutputStream dos;
		String msg="  ";
		
		Socket cs=new Socket("localhost",1240);
		
		d=new DataInputStream(System.in);
		dis=new DataInputStream(cs.getInputStream());
		dos=new DataOutputStream(cs.getOutputStream());
			
		while(!msg.equalsIgnoreCase("bye"))
		{
			System.out.println("Enter msg for server: ");
			msg=d.readLine();
			dos.writeUTF(msg);

			msg=dis.readUTF();
			System.out.println("Server says: "+msg);
		
		}
		dis.close();	
		dos.close();
		cs.close();	
	}
}

		
					