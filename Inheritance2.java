package okk;
import java.util.*;
class Grandfather
{
	String gname;
	Scanner sc=new Scanner(System.in);
	void accept1()
	{
		System.out.println("Enter the Grandfather name:");
		gname=sc.next();
	}
}
class Father extends Grandfather
{
	String fname;
	void accept2()
	{
		System.out.println("Enter the FAther");
		fname=sc.next();
	}
}
class Child extends Father
{
	String cname;
	void accept3()
	{
		System.out.println("Enter the Child");
		cname=sc.next();
	}
}
class Surname extends Child
{
	String sname;
	void accept4()
	{
		System.out.println("Enter the Surname");
		sname=sc.next();
	}
	void disp()
	{
		System.out.println("Grandfather="+gname);
		System.out.println("Father="+fname);
		System.out.println("Child="+cname);
		System.out.println("Surname="+sname);
	}
}
public class Inheritance2 {

	public static void main(String[] args)
	{
		Surname ob=new Surname();
		ob.accept1();
		ob.accept2();
		ob.accept3();
		ob.accept4();
		ob.disp();
		
	}

}

