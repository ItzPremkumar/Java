package AWT;
import java.awt.*;
import java.awt.event.*;
public class windowlistneer extends Frame implements ActionListener
{
   Label l1,l2;
   TextField t1,t2;
   Button b1;
   windowlistneer()
   {
	   setVisible(true);
		  setSize(500,500);
	      setLayout(new FlowLayout());
	      l1=new Label("Enter sTring:");
	      l2=new Label("Reverse String:");
	      t1=new TextField(10);
	      t2=new TextField(10);
	      b1=new Button("OK");
	      add(l1);add(t1);add(l2);add(t2);
	      add(b1);
	      b1.addActionListener(this);
   }
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
	 if(e.getSource()==b1)
	 {
		 String s=t1.getText();
	     StringBuffer sbr=new StringBuffer(s);
	     sbr.reverse();
	     t2.setText(""+sbr);
	 }
		
	}
	public static void main(String[] args)
	{
		new windowlistneer();
	}
}
