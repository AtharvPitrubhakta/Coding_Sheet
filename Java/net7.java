// Client Code:
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;
public class net7 extends JFrame implements ActionListener
{
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JButton b1;
DataInputStream dis=null;
DataOutputStream dos=null;
public net7()
{
Container d=getContentPane();
d.setLayout(null);
l1=new JLabel("Enter SeatNo");
l2=new JLabel("Your Name is");
l3=new JLabel("You Scored ");
t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
b1=new JButton("Find");
b1.addActionListener(this);
l1.setBounds(50,100,200,30);
t1.setBounds(250,100,200,30);
b1.setBounds(500,100,150,30);

l2.setBounds(50,200,200,30);
t2.setBounds(250,200,400,30);

l3.setBounds(50,250,200,30);
t3.setBounds(250,250,300,30);

d.add(l1);
d.add(l2);
d.add(l3);
d.add(t1);
d.add(t2);
d.add(t3);
d.add(b1);
try
{
Socket s=new Socket("localhost",7500);
InputStream is=s.getInputStream();
OutputStream os=s.getOutputStream();
dis=new DataInputStream(is);
dos=new DataOutputStream(os);
}catch(Exception ee){}
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(800,600);
setVisible(true);
}
public void actionPerformed(ActionEvent tt)
{
try
{
dos.writeUTF(t1.getText().trim());
String x=dis.readUTF();
t2.setText(x.substring(0,x.indexOf(':')));
t3.setText(x.substring(x.indexOf(':')+1));
}
catch(Exception ee){}
}
public static void main(String[] args)
{
new net7();
}
}