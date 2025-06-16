package AWT;
import java.awt.*;
import java.awt.event.*;

public class awtevvent10 extends Frame implements ActionListener
{
 TextField t1;
 Checkbox c1,c2,c3;
 
 awtevvent10()
 {
	 setVisible(true);
	 setSize(500,500);
	 setTitle("Checkbox:");
	 setBackground(Color.white);
	 CheckboxGroup cg1=new CheckboxGroup();
	 c1=new Checkbox("Net");
	 c2=new Checkbox("PHP");
	 c3=new Checkbox("Java");
	 t1=new TextField(10);
	 TextField.setEditable(false);
	 c1.addActionListener(this);
	 c2.addActionListener(this);
	 c3.addActionListener(this);
	 add(c1);add(c2);add(c3);
	 add(t1);
 }
 @Override
	public void actionPerformed(ActionEvent ae)
    {
	    String text="";
		if(c1.isSelected()) text+="net";
		if(c2.isSelected()) text+="php";
		if(c3.isSelected())text+="java";
		TextField.setText(text.trim());
	}
	public static void main(String[] args) 
	{
		new awtevvent10();

	}

	

}