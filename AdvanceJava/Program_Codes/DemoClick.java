import java.awt.*;
import java.awt.event.*;

class DemoClick extends Frame implements MouseListener
{
	Button b1;

	DemoClick()
	{
		setLayout(null);
		
		b1=new Button("Click");
		b1.setBounds(50, 100, 60, 30);
		add(b1);		
		this.addMouseListener(this);		
	}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	
	public void mouseClicked(MouseEvent e)
	{
		int x=e.getX();
		int y=e.getY();	
		showStatus("Mouse Clicked x="+x+"y="+y);
	}
	public static void main(String args[])
	{
		DemoClick d=new DemoClick();
		d.setVisible(true);
		d.setSize(400, 400);
	}
}	