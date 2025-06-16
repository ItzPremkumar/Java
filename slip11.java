package Slips;
import java.util.*;
abstract class order
{
 int id;
 String des;
}
class purchesorder extends order
{
 String cname;
 void accept()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the id:");
	 id=sc.nextInt();
	 System.out.println("Enter the customer name:");
	 cname=sc.next();
	 System.out.println("Enter the desc:");
	 des=sc.next();
 }
 void disp()
 {
	 System.out.println(" id:"+id);
	 System.out.println(" cname:"+cname);
	 System.out.println(" desi:"+des);
 }
}
class salesorder extends order
{
	String vname;
	void accept()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the id:");
		 id=sc.nextInt();
		 System.out.println("Enter the vendor name:");
		 vname=sc.next();
		 System.out.println("Enter the desc:");
		 des=sc.next();
	 }
	 void disp()
	 {
		 System.out.println(" id:"+id);
		 System.out.println(" cname:"+vname);
		 System.out.println(" desi:"+des);
	 }
	
}
public class slip11
{

	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		purchesorder ob[]=new purchesorder[10];
		salesorder ob1[]=new salesorder[10];
		int ch;
		do 
		{
			System.out.println("1.Purches order\n2.Sales order");
			 ch=sc.nextInt();
			switch (ch) 
			{
			 case 1: 
				 for(int i=0;i<3;i++)
				 {
					 ob[i]=new purchesorder();
					 ob[i].accept();
				 }
				 for(int i=0;i<3;i++)
				 {
					 ob[i].disp();
				 }
		   break;
			 case 2: 
				 for(int i=0;i<3;i++)
				 {
					 ob1[i]=new salesorder();
					 ob1[i].accept();
				 }
				 for(int i=0;i<3;i++)
				 {
					 ob1[i].disp();
				 }
		   break;
			
			}
		} while (ch!=2);
			

	}

}
