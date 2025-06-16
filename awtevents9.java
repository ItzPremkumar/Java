package AWT;
import java.awt.*;
import java.awt.event.*;

import Exception.number;

public class awtevents9 extends Frame implements ActionListener
{
	TextField t1;
	Button b1;
	Label l1;
	awtevents9()
	{
		setVisible(true);
		setSize(500,600);
		setLayout(new FlowLayout());
		t1=new TextField(10);
		l1=new Label("Label:");
		b1=new Button("OK");
		add(l1);add(t1);
		add(b1);
		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			l1.setBackground(Color.red);
		}
	}

	public static void main(String[] args)
	{
		new awtevents9();

	}

}

