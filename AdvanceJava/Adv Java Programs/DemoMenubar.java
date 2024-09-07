import java.awt.*;

public class DemoMenubar extends Frame
{
	MenuBar mb;
	Menu file, edit, format;
	MenuItem open, save, copy, paste;
	CheckboxMenuItem www;

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
		www=new CheckboxMenuItem("Word Wrap");
		
		file.add(open);
		file.add(save);

		edit.add(copy);
		edit.add(paste);
	
		format.add(www);

		mb.add(file);	
		mb.add(edit);
		mb.add(format);
	}
	public static void main(String args[])
	{
		DemoMenubar d=new DemoMenubar();
		d.setSize(400, 400);
		d.setVisible(true);
	}
}