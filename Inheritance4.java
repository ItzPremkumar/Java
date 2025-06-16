package okk;
import java.util.*;
class Internal
{
	int s1,s2,s3;
	Scanner sc=new Scanner(System.in);
	void accept1()
	{
		System.out.println("Enter the internal mark of Java:");
		s1=sc.nextInt();
		System.out.println("Enter the internal mark of DSA:");
		s2=sc.nextInt();
		System.out.println("Enter the internal mark of Python:");
		s3=sc.nextInt();
	}
}
class External extends Internal
{
  int e1,e2,e3;
  void accept2()
  {
    System.out.println("Enter the External mark of Java:");
	e1=sc.nextInt();
	System.out.println("Enter the External mark of DSA:");
	e2=sc.nextInt();
	System.out.println("Enter the External mark of Python:");
	e3=sc.nextInt();
  }
}
class Practical extends External
{
  int p1,p2;
  void accept3()
  {
	System.out.println("Enter the Practical mark of Java:");
	p1=sc.nextInt();
	System.out.println("Enter the Practical mark of DSa:");
	p2=sc.nextInt();
 }
}
class Result extends Practical
{
	float sum,per;
	void cal()
	{
		sum=s1+s2+s3+e1+e2+e3+p1+p2;
		per=(sum/300)*100;
	}
	void disp()
	{
		System.out.println("Total pers="+per);
	}
  	
}
public class Inheritance4 {

	public static void main(String[] args)
	{
		Result ob=new Result();
		ob.accept1();
		ob.accept2();
		ob.accept3();
		ob.cal();
		ob.disp();

	}

}
