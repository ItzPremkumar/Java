package AWT;
import java.awt.*;
import java.awt.event.*;
public class Wdemo extends Frame implements ActionListener
{
   Label l1,l2;
   TextField t1,t2;
   Button b1;
   Checkbox c1,c2,c3;
   CheckboxGroup cg;
   Wdemo()
   {
	   setVisible(true);
		  setSize(500,500);
	      setLayout(new FlowLayout());
	      cg=new CheckboxGroup();
	      c1=new Checkbox("Pink",cg,true);
	      c2=new Checkbox("Yellow",cg,false);
	      c3=new Checkbox("Orange",cg,false);
	      b1=new Button("OK");
	      add(c1);
	      add(c2);
	      add(c3);
	      add(b1);
	      b1.addActionListener(this);
   }
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
	 if(e.getSource()==b1)
	 {
		 if(c1.getState()==true)
		 {
			 setBackground(Color.pink);
		 }
		 if(c2.getState()==true)
		 {
			 setBackground(Color.yellow);
		 }
		 if(c3.getState()==true)
		 {
			 setBackground(Color.orange);
		 }
	 }
		
	}
	public static void main(String[] args)
	{
		new Wdemo();
	}
}
