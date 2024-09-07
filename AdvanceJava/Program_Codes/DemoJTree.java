import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

public class DemoJTree extends JApplet
{	
	JTree jt;
	DefaultMutableTreeNode tp , ms , pl , ab , pt , cr , sh ; 	
	JScrollPane jsp;
	
	public void init()
	{
		Container c=getContentPane();	
		c.setLayout(new BorderLayout());	
		
		tp = new DefaultMutableTreeNode("This PC");
		
		ms = new DefaultMutableTreeNode("Music");
		pl = new DefaultMutableTreeNode("Playlists");
		ab = new DefaultMutableTreeNode("Albums");
	
		pt = new DefaultMutableTreeNode("Pictures");
		cr = new DefaultMutableTreeNode("Camera Roll");
		sh = new DefaultMutableTreeNode("Screenshots");
		
		ms.add(pl);
		ms.add(ab);

		pt.add(cr);
		pt.add(sh);	
		
		tp.add(ms);
		tp.add(pt);
	
		jt = new JTree(tp);
		
		int vsb = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int hsb = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		 
		jsp = new JScrollPane(jt , vsb , hsb);
		c.add(jsp, BorderLayout.WEST);
	}
	
}
/*
<applet code="DemoJTree.java" width=400 height=400></applet>
*/