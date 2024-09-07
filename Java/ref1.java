/*
Reflection : to display information regarding method and constructors in java
*/
import java.lang.reflect.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ref1 extends JFrame implements ActionListener
{
JTextField t1;
JButton b1;
JComboBox c1,c2;
public ref1()
{
Container d=getContentPane();
d.setLayout(null);
t1=new JTextField(20);
b1=new JButton("Click");
b1.addActionListener(this);
c1=new JComboBox();
c2=new JComboBox();
t1.setBounds(50,50,400,30);
b1.setBounds(460,50,200,30);
c1.setBounds(50,100,800,50);
c2.setBounds(50,400,800,50);
d.add(t1);
d.add(b1);
d.add(c1);
d.add(c2);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(1000,600);
setVisible(true);
}
public void actionPerformed(ActionEvent tt)
{
try
{
Class c=Class.forName(t1.getText().trim());
Constructor con1[]=c.getDeclaredConstructors();
Method mon1[]=c.getDeclaredMethods();
c1.removeAllItems();
c2.removeAllItems();
for(int i=0;i<con1.length;i++)
c1.addItem(con1[i].toString());

for(int i=0;i<mon1.length;i++)
c2.addItem(mon1[i].toString());

}catch(Exception ee){}
}
public static void main(String[] args)
{
new ref1();
}
}

