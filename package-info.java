package Exception;
import java.util.*;

 class negativeage extends Exception
  { 
    
	 public String toString()
	 {
		 return "Invalid Negative age!";
	 }
  }
  public class userdefineexception
  {
	public static void main(String[] args)
	{ 
	 try
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the age:");
		int a=sc.nextInt();
		if(a<=0)
			throw new negativeage();
		System.out.println("Age="+a);
		
	 }
	 catch(Exeption e)
	 {
		 System.out.println("error="+e);
	 }
		
	}
  }
