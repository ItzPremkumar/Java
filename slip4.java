package Slips;
import java.util.*;
abstract class Staff
{
  int id;
  String name;
}
class Officestuff extends Staff
{
	String dept;
	Officestuff(int id,String name,String dept)
	{
	 this.id=id;
	 this.name=name;
	 this.dept=dept;
	}
	void disp()
	{
		System.out.println("Id="+id);
		System.out.println("name="+name);
		System.out.println("dept="+dept);
	}
	
}
public class slip4
{
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the limit:");
	 int n=sc.nextInt();
	 Officestuff ob[]=new Officestuff[n];
	 for(int i=0;i<n;i++)
	 {
		 System.out.println("Enter the id=");
		 int id=sc.nextInt(); 
		 System.out.println("Enter the name=");
		 String name=sc.next(); 
		 System.out.println("Enter the department=");
		 String dept=sc.next(); 
		  ob[i]=new Officestuff(id,name,dept);
		 
	 }
	 for(int i=0;i<n;i++)
	 {
		 ob[i].disp();
	 }
	}

}
