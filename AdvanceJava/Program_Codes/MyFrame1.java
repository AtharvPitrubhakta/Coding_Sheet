import java.awt.*;
import java.awt.event.*;

class MyFrame1 extends Frame
{
	MyFrame1()
	{
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});			
	}
	public static void main(String args[])
	{
		MyFrame1 f=new MyFrame1();
		f.setSize(400, 400);
		f.setVisible(true);
	}
}