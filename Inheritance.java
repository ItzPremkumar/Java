package okk;
import java.util.*;
class Continent
{
	String cname;
	Scanner sc=new Scanner(System.in);
	void accept1()
	{
		System.out.println("Enter the Continent");
		cname=sc.next();
	}
}
class Country extends Continent
{
	String coname;
	void accept2()
	{
		System.out.println("Enter the Country");
		coname=sc.next();
	}
}
class State extends Country
{
	String sname;
	void accept3()
	{
		System.out.println("Enter the State");
		sname=sc.next();
	}
}
class Place extends State
{
	String pname;
	void accept4()
	{
		System.out.println("Enter the Place");
		pname=sc.next();
	}
	void disp()
	{
		System.out.println("Continent="+cname);
		System.out.println("Country="+coname);
		System.out.println("State="+sname);
		System.out.println("Place="+pname);
	}
}
public class Inheritance {

	public static void main(String[] args)
	{
		Place ob=new Place();
		ob.accept1();
		ob.accept2();
		ob.accept3();
		ob.accept4();
		ob.disp();
		
	}

}
