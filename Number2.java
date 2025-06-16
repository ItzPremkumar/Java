package Exception;
import java.util.*;
class invalidnum1 extends Exception
{
  public String toString()
  {
	  return"Number is invalid:";
  }
}
public class Number2
{
 public static void main(String[] args)
 {
	 try
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number:");
		 int n=sc.nextInt();
		 if(n>=100)
			 throw new invalidnum1();
		 int s=0;
		 while(n>0)
		 {
	      int d=n%10;
	      s=s+d;
		  n=n/10;
		 }
		 System.out.println("sum="+s);
	 }catch(Exception e)
	 {
		 System.out.println("Error!"+e);
	 }
 }
}
