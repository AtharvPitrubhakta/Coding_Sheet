/*
2] Develop an applet/applications using Choice component to add names of different languages(like C, C++, java, Python).
*/

import java.awt.*;

class TwitChoice extends Frame
{
	Choice ch	;

	TwitChoice()
	{
		setLayout(null);
			
		ch = new Choice();
	
		ch.add("C");
		ch.add("C++");
		ch.add("Java");
		ch.add("Python");
		ch.add("PHP");

		add(ch);
		
		ch.setBounds(100, 100, 100, 20);
	}
	public static void main(String args[])
	{
		TwitChoice ch=new TwitChoice();
		ch.setSize(400 , 300);
		ch.setVisible(true);
	}
}