import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DemoPro extends JFrame implements AdjustmentListener
{
	JScrolllBar sb1, sb2, sb3;
	Container c;
		
	DemoPro()
	{
		c = getContentPane();
		setLayout(null);
	
		sb1 = new JScrollBar(JScrollBar.VERTICAL, 10, 30, 0, 255);
		sb2 = new JScrollBar(JScrollBar.VERTICAL, 10, 30, 0, 255);
		sb3 = new JScrollBar(JScrollBar.VERTICAL, 10, 30, 0, 255);
		
		c.add(sb1);
		c.add(sb2);
		c.add(sb3);
	
		sb1.setBounds(100, 100, 30, 200);
		sb2.setBounds(150, 100, 30, 200);
		sb3.setBounds(200, 100, 30, 200);

		sb1.addAdjustmentListener(this);
		sb2.addAdjustmentListener(this);
		sb3.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{	
		int r = sb1.getValue();
		int g = sb2.getValue();
		int b = sb3.getValue();
		
		Color c1= new Color(r , g , b);
		c.setBackground(c1);
	
		setTitle(r+""+g+""+b);
	}
	public static void main(String args[])
	{
		DemoPro p= DemoPro();
		p.setSize(400, 400);
		p.setVisible(true);	 	
	}
}