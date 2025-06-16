package Slips;
import java.util.*;
class invaliduser extends Exception
{
	public invaliduser()
	{
     System.out.println("You are corona positive!!");;
	}
}
class Patient
{
	Scanner sc=new Scanner(System.in);
  int age,oxy,hrct;
  String name;
  void accept()
  {
	System.out.println("Enter the name:");
	name=sc.next();
	System.out.println("Age:");
	age=sc.nextInt();
	System.out.println("Enter oxygen and hrct report:");
	oxy=sc.nextInt();
	hrct=sc.nextInt();
  }
}
public class slip7
{
  public static void main(String[] args) 
	{
	  Patient p=new Patient();
	  p.accept();
	  try
	  {
		 if(p.oxy<95&&p.hrct>10)
			 throw new invaliduser();  
		 else
		 {
			 System.out.println("name:"+p.name); 
			 System.out.println("age:"+p.age); 
			 System.out.println("oxygen:"+p.oxy); 
			 System.out.println("hrct:"+p.hrct); 
		 }
	  }catch(Exception e)
	  {
		  
	  }
	}

}
