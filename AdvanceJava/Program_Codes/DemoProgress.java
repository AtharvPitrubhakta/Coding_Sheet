import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class DemoProgress extends JFrame implements ActionListener
{
	JProgressBar pb;
	JButton b1;

	DemoProgress()
	{
		Container c=getContentPane();
		c.setLayout(null);
	
		b1=new JButton("Click");
	
		pb=new JProgressBar(0, 100);
		
		pb.setValue(0);
		pb.setStringPainted(true);
		pb.setBorderPainted(true);
		pb.setToolTipText("Progress");	
	
		c.add(b1);
		c.add(pb);
	
		b1.setBounds(20, 20, 80, 30);	
		pb.setBounds(110, 20, 200, 25);
		pb.setVisible(false);	
		
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		int i=0;
			
		if(e.getSource() == b1)
		{
			pb.setVisible(true);	
			try
			{
				while(i <= 100)
				{
					pb.setValue(i);
					Thread.sleep(50);
					i++;
				}
			}catch(Exception e1){}
		}
	}		
	public static void main(String args[])
	{
		DemoProgress d=new DemoProgress();
		d.setSize(400, 400);	
		d.setVisible(true);
		d.setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
} 