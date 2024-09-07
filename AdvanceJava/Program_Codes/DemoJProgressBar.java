// Program to demonstrate use of progressbar in swing.

import java.awt.*;
import javax.swing.*;

class DemoJProgressBar extends JFrame
{
	JProgressBar jp;

	DemoJProgressBar()
	{
		Container c=getContentPane();	
		c.setLayout(null);
	
		jp = new JProgressBar(0, 100);	
		c.add(jp);	
		jp.setBounds(50, 100, 200, 30);
	
		jp.setValue(0);	
		jp.setStringPainted(true);	
		jp.setToolTipText("Hello");
		jp.setBorderPainted(true);	
	}
	void iterate()
	{
		try
		{
			int i=0;
			while(i<=1000)
			{
				jp.setValue(i);	
				i =  i+20;
				Thread.sleep(200);	
			}
		}catch(Exception e){}
	}			
	public static void main(String args[])
	{
		DemoJProgressBar d=new DemoJProgressBar();
		d.setSize(400, 400);
		d.setVisible(true);
		d.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		d.iterate();
	}
}		