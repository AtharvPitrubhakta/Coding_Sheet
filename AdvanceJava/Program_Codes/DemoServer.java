import java.net.*;
import java.io.*;
class DemoServer
{
	public static void main(String args[])throws IOException 
	{
		DataInputStream dis, d;
		DataOutputStream dos;
		String msg=" ";
	
		ServerSocket ss=new ServerSocket(1240);
		System.out.println("Sever is waiting....");
		Socket cs=ss.accept();

		d=new DataInputStream(System.in);
		dis=new DataInputStream(cs.getInputStream());
		dos=new DataOutputStream(cs.getOutputStream());
	
		while(!msg.equalsIgnoreCase("bye"))
		{
			msg=dis.readUTF();
			System.out.println("Client says:"+msg);
			
			System.out.println("Enter msg for client:");
			msg=d.readLine();
			dos.writeUTF(msg);
		}
		dis.close();
		dos.close();
		cs.close();
		ss.close();
	}
}
				