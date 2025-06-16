package Exception;
import java.util.*;
class negativeage1 extends Exception
{ 
  
	 public String toString()
	 {
		 return "Invalid Negative age!";
	 }
}
public class Age1
{
	public static void main(String[] args)
	{ 
	 try
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the age:");
		int a=sc.nextInt();
		if(a<=18)
			throw new negativeage();
		System.out.println("You are eligible for voting:::");
		
	 }
	 catch(Exception e)
	 {
		 System.out.println("error="+e);
	 }
		
	}
}
