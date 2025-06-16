package AWT;
import java.awt.*;
import java.awt.event.*;
public class awtevent6 extends Frame implements ActionListener
{
 Label l1,l2,l3,l4,l5,l6,l7;
 TextField t1,t2,t3;
 List lst;
 Button b1,b2;
 Choice ch1,ch2;
 Checkbox c1,c2,v1,v2,v3,s1,s2,s3;
 awtevent6()
 {
	 setVisible(true);
	 setSize(500,500);
	 setTitle("Co-Win Registration");
	 setBackground(Color.white);
	 setLayout(new FlowLayout());
	 l1=new Label("Adharcard NO:");
	 l2=new Label("Birth Year:");
	 l3=new Label("Mobile No:");
	 l4=new Label("Age Group:");
	 l5=new Label("Select Hospital:");
	 l6=new Label("Vaccines:");
	 l7=new Label("Time slot:");
	 t1=new TextField(10);
	 t2=new TextField(10);
	 ch1=new Choice();
	 ch1.add("2000");ch1.add("2001");
	 ch1.add("2002");ch1.add("2003");
	 ch2=new Choice();
	 CheckboxGroup cg=new CheckboxGroup();
	 c1=new Checkbox("18& above",cg,true);
	 c2=new Checkbox("45& above",cg,false);
	 ch2.add("City care");
	 ch2.add("Sanjivani Hospital");
	 ch2.add("Tata Hospital");
	 CheckboxGroup cg1=new CheckboxGroup();
	 v1=new Checkbox("Covishield",cg1,true);
	 v2=new Checkbox("Covaxin",cg1,true);
	 v3=new Checkbox("Sputnik V",cg1,true);
	 CheckboxGroup cg2=new CheckboxGroup();
	 s1=new Checkbox("Morning",cg2,true);
	 s2=new Checkbox("Afternon",cg2,true);
	 s3=new Checkbox("Evening",cg2,true);
	 t3=new TextField(10);
	 b1=new Button("Submit");
	 b2=new Button("Exit");
	 add(l1);add(t1);
	 add(l2);add(ch1);
	 add(l3);add(t2);
	 add(l4);add(c1);add(c2);
	 add(l5);add(ch2);
	 add(l6);add(v1);add(v2);add(v3);
	 add(l7);add(s1);add(s2);add(s3);
	 add(b1);add(b2);
 }
 @Override
	public void actionPerformed(ActionEvent ae)
    {
		if(ae.getSource()==b2)
		{
			dispose();
		}
	}
	public static void main(String[] args) 
	{
		new awtevent6();

	}

	

}
