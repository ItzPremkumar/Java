package AWT;
import java.awt.*;
import java.awt.event.*;
public class awtevent5 extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5;
	awtevent5()
	{
	 setVisible(true);
	 setSize(500,500);
	 setTitle("List Demo");
	 setBackground(Color.cyan);
	 setLayout(new FlowLayout());
	 b1=new Button("Orange");
	 b2=new Button("yellow");
	 b3=new Button("pink");
	 b4=new Button("black");
	 b5=new Button("Exit");
	 add(b1); add(b2);
	 add(b3); add(b4);
	 add(b5);
	 b1.addActionListener(this);
	 b2.addActionListener(this);
	 b3.addActionListener(this);
	 b4.addActionListener(this);
	 b5.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent ae)
	{
	 if(ae.getSource()==b1)
	 {
       setBackground(Color.orange);
     }
	 if(ae.getSource()==b2)
	 {
       setBackground(Color.yellow);
	 }
	 if(ae.getSource()==b3)
	 {setBackground(Color.pink);
	 }
	 if(ae.getSource()==b4)
	 {
	   setBackground(Color.black);
	 }
	 if(ae.getSource()==b5)
	 {
	   dispose();
	 }
	}
  public static void main(String[] args)
  {
	new awtevent5();
  }
}