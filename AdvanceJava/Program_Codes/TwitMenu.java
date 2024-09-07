/*
4] Develop a program which creates menu of different colors and disable menu item for Black color.
*/

import java.awt.*;

class TwitMenu extends Frame
{
	MenuBar mb;
	Menu white,red,yellow,blue,black;

	TwitMenu()
	{		
		mb=new MenuBar();
		setMenuBar(mb);
		
		white = new Menu("White");	
		red = new Menu("Red");
		yellow = new Menu("Yellow");
		blue = new Menu("Blue");
		black = new Menu("Black");
		
	
		mb.add(white);
		mb.add(red);
		mb.add(yellow);
		mb.add(blue);
		mb.add(black);
		
		black.setEnabled(false);			
	}	
	public static void main(String args[])
	{
		TwitMenu m= new TwitMenu();
		m.setSize(400 , 300);
		m.setVisible(true);
	}
}
