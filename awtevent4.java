package AWT;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class awtevent4 extends Frame implements ActionListener
{
 Label l1,l2,l3;
 TextField t1,t2;
 List lst;
 Button b1,b2,b3,b4;
 awtevent4()
 {
	 setVisible(true);
	 setSize(500,500);
	 setTitle("Login Form::");
	 setBackground(Color.white);
	 setLayout(new FlowLayout());
	 l1=new Label("Enter Username:");
	 l2=new Label("Password:");
	 t1=new TextField(10);
	 t2=new TextField(10);
	 lst=new List();
	 b1=new Button("Login");
	 b2=new Button("Exit");
	 add(l1);add(t1);
	 add(l2);add(t2);
	 add(b1);add(b2);
	 b1.addActionListener(this);
	 b2.addActionListener(this);
 }
 @Override
	public void actionPerformed(ActionEvent ae)
    {
		if(ae.getSource()==b1)
		{
		  String s1=t1.getText();
		  String s2=t2.getText();
		  if(s1.equals("RBNB")&&s2.equals("RBNB123"))
			  JOptionPane.showMessageDialog(this,"Login Successfull.....");
		  else
			  JOptionPane.showMessageDialog(this,"Invalid information.....");
			  
		  lst.add(s1);
		}
		if(ae.getSource()==b2)
		{
			dispose();
		}
		if(ae.getSource()==b3)
		{
		 lst.clear();	
		}
		if(ae.getSource()==b4)
		{
			dispose();
		}
	}
	public static void main(String[] args) 
	{
		new awtevent4();

	}

	

}
