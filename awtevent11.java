package AWT;
import java.awt.*;
import java.awt.event.*;
public class awtevent11 extends Frame implements ActionListener
{
	Label l1,l2,l3,l4;
	Button b1;
	TextField t1,t2,t3,t4;
     awtevent11()
     {
    	 setVisible(true);
 		setSize(500,600);
 		setLayout(new FlowLayout());
 		t1=new TextField(10);
 		t2=new TextField(10);
 		t3=new TextField(10);
 		t4=new TextField(10);
 		l1=new Label("Enter number 1:");
 		l2=new Label("Enter number 2:");
 		l3=new Label("Enter number 3:");
 		l4=new Label("Maximum Number:");
 		b1=new Button("OK");
 		add(l1);add(t1);
 		add(l2);add(t2);
 		add(l3);add(t3);
 		add(l4);add(t4);
 		add(b1);
 		b1.addActionListener(this);
     }
     @Override
 	public void actionPerformed(ActionEvent e)
     {
 		if(e.getSource()==b1)
 		{
 			int n1=Integer.parseInt(t1.getText());
 			int n2=Integer.parseInt(t2.getText());
 			int n3=Integer.parseInt(t3.getText());
 			int max=Math.max(n1,Math.max(n2, n3));
 			t4.setText(String.valueOf(max));
 		}
 	}
	public static void main(String[] args) {
		
		new awtevent11();
	}

}
