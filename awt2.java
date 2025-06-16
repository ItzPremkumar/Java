package AWT;
import java.awt.*;
public class awt2 extends Frame
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	awt2()
	{
		setVisible(true);
		setSize(500,600);
		setTitle(":::Registration Form:::");
		setBackground(Color.yellow);
		setLocation(200,300);
		setLayout(new FlowLayout());
		l1=new Label("Username:");
		l2=new Label("Password:");
		l3=new Label("OTP:");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		b1=new Button("Login");
		b2=new Button("Exit");
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(b1);add(b2);
		
		
	}
	

	public static void main(String[] args)
	{
		awt2 ob=new awt2();
	
	}

}
