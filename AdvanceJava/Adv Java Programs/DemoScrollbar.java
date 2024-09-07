// Design an applet/application to demostrate use of scrollbar.

import java.awt.*;

class DemoScrollbar extends Frame
{
	Scrollbar sb1,sb2,sb3;

	DemoScrollbar()
	{
		setLayout(null);

		sb1=new Scrollbar(Scrollbar.VERTICAL, 10, 30, 0, 255);
		sb2=new Scrollbar(Scrollbar.VERTICAL, 90, 30, 0, 255);
		sb3=new Scrollbar(Scrollbar.VERTICAL, 180, 30, 0, 255);
		
		add(sb1);
		add(sb2);
		add(sb3);

		sb1.setBounds(100, 100, 30, 200);
		sb2.setBounds(150, 100, 30, 200);
		sb3.setBounds(200, 100, 30, 200);
	}
	public static void main(String args[])
	{
		DemoScrollbar f=new DemoScrollbar();
		f.setSize(400, 400);
		f.setVisible(true);
	}
}

