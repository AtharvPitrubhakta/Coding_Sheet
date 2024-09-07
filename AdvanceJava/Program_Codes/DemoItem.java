import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoItem extends Applet implements ItemListener
{
	Label l1;
	Choice ch;
	
	public void init()
	{
		setLayout(null);
	
		ch=new Choice();
		ch.add("Dhule");
		ch.add("Pune");
		ch.add("Mumbai");

		l1=new Label();
		
		add(ch);
		add(l1);
	
		ch.setBounds(50, 30, 80, 30);
		ch.setBounds(150, 30, 150, 30);

		ch.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource() == ch)
		l1.setText("You selected: "+ch.getSelectedItem());
	}
}
/*
<applet code="DemoItem.java" width=400 height=300></applet>
*/