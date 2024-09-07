// Title = Program to create application window(standalone Applications)

import java.awt.*;

class MyFrame extends Frame
{
	MyFrame()	
	{	
		// Initialization
	}
	public static void main(String args[])
	{
		MyFrame f = new MyFrame();
		f.setSize(400 , 400);
		f.setVisible(true);
	}
}
