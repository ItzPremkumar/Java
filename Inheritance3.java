package okk;
import java.util.*;
class College
{
  Scanner sc=new Scanner(System.in);
  int cno;
  String cname,add;
  void accept1()
  {
	  System.out.println("Enter the college id:");
	  cno=sc.nextInt();
	  System.out.println("Enter the college Name:");
	  cname=sc.next();
	  System.out.println("Enter the college Address:");
	  add=sc.next();
  }
}
class Student extends College
{
	int rno,per;
	String sname;
	void accept2()
	{
		  System.out.println("Enter the Stuent id:");
		  rno=sc.nextInt();
		  System.out.println("Enter the Student NAme:");
		  sname=sc.next();
		  System.out.println("Enter the Student persentage:");
		  per=sc.nextInt();
	}
	void disp1()
	{
		 System.out.println("Student id:"+rno);
		 System.out.println("Student name:"+sname);
		 System.out.println("Student Persentage:"+per);
		 System.out.println("College id:"+cno);
		 System.out.println("Colllege name:"+cname);
		 System.out.println("College address:"+add);
	}
}
class Teacher extends College
{
	int tid,sal;
	String tname;
	void accept3()
	{
		  System.out.println("Enter the Teacher id:");
		  tid=sc.nextInt();
		  System.out.println("Enter the Teacher NAme:");
		  tname=sc.next();
		  System.out.println("Enter the Teracher Salary:");
		  sal=sc.nextInt();
	}
	void disp2()
	{
		 System.out.println("Teacher id:"+tid);
		 System.out.println("Teacher name:"+tname);
		 System.out.println("Teacher SAlaray:"+sal);
		 System.out.println("College id:"+cno);
		 System.out.println("Colllege name:"+cname);
		 System.out.println("College address:"+add);
	}
}
public class Inheritance3 {

	public static void main(String[] args)
	{
		Student ob1=new Student();
		Teacher ob2=new Teacher();
		ob1.accept1();
		ob1.accept2();
		ob1.disp1();
		System.out.println("==================================================================");
		ob2.accept1();
		ob2.accept3();
		ob2.disp2();

	}

}
