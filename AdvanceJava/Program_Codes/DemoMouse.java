import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoMouse extends Applet implements MouseListener
{
	public void init()
	{
		this.addMouseListener(this);
	}
	public void mousePressed(MouseEvent me)
	{
		float r=(float) Math.random();
		float g=(float) Math.random();
		float b=(float) Math.random();
	
		Color c=new Color(r, g, b);
		setBackground(c);
	
	}
	public void mouseReleased(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	
}
/*
<applet code="DemoMouse.java" width=400 height=400></applet>
*/
