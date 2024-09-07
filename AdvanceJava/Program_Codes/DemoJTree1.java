import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

public class DemoJTree1 extends JApplet
{
	JTree jt;
	DefaultMutableTreeNode  tn, mh, dh, pn, gr, gn, rk;
	JScrollPane jsp;
	
	public void init()
	{
		Container c = getContentPane();	
		c.setLayout(new BorderLayout());

		tn = new DefaultMutableTreeNode("India");	
		
		mh = new DefaultMutableTreeNode("Maharashtra");
		dh = new DefaultMutableTreeNode("Dhule");
		pn = new DefaultMutableTreeNode("Pune");
		
		gr = new DefaultMutableTreeNode("Gujarat");
		gn = new DefaultMutableTreeNode("Gandhinagar");
		rk= new DefaultMutableTreeNode("Rajkot");
	
		mh.add(dh);
		mh.add(pn);
		
		gr.add(gn);
		gr.add(rk);

		tn.add(mh);
		tn.add(gr);	
	
		jt = new JTree(tn);
		int vsb = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;				int hsb = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

		jsp = new JScrollPane(jt, vsb, hsb);
		c.add(jsp , BorderLayout.WEST);
	}
}
/*
<applet code="DemoJTree1.java" width=400 height=400></applet>
*/		