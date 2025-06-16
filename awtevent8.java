package AWT;
import java.awt.*;
import java.awt.event.*;

import Exception.number;

public class awtevent8 extends Frame implements ActionListener
{
	TextField t1;
	Button b1;
	awtevent8()
	{
		setVisible(true);
		setSize(500,600);
		setLayout(new FlowLayout());
		t1=new TextField(10);
		b1=new Button("OK");
		add(t1);
		add(b1);
		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			t1.setBackground(Color.red);
		}
	}

	public static void main(String[] args)
	{
		new awtevent8();

	}

}
