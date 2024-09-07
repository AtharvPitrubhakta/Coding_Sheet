/*
1] Develop a program to demonstrate menu bar, menus, and menu items.
*/

import java.awt.*;

public class DemoMenubar extends Frame
{
	MenuBar mb;
	Menu file, edit, format;
	MenuItem open, save, copy, paste;
	CheckboxMenuItem ww;
	
	DemoMenubar()
	{
		mb=new MenuBar();
		setMenuBar(mb);

		file=new Menu("File");
		edit=new Menu("Edit");
		format=new Menu("Format");
		
		open=new MenuItem("Open");
		save=new MenuItem("Save");
		copy=new MenuItem("Copy");
		paste=new MenuItem("Paste");
		ww=new CheckboxMenuItem("Word Wrap");
		
		file.add(open);
		file.add(save);
		file.add(copy);
		file.add(paste);
	
		format.add(ww);
			
		mb.add(file);
		mb.add(edit);
		mb.add(format);

		//edit.setEnabled(false);
			
	}	
	
	public static void main(String args[])
	{
		DemoMenubar d=new DemoMenubar();
		d.setSize(400, 300);
		d.setVisible(true);
	}
}