package Exception;
import java.util.*;
class invalidnum extends Exception
{
  public String toString()
  {
	  return"Number is invalid:";
  }
}
public class number
{
 public static void main(String[] args)
 {
	 try
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number:");
		 int n=sc.nextInt();
		 if(n==0)
			 throw new invalidnum();
		 int n1=n;
		 int s=0;
		 while(n>0)
		 {
	      int d=n%10;
	      s=s+d*d*d;
		  n=n/10;
		 }
		 if(s==n1)
			 System.out.println("Number is armstrong:");
		 else
			 System.out.println("Number is not armstrong:");
	 }catch(Exception e)
	 {
		 System.out.println("Error!"+e);
	 }
 }
}
