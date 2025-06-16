package Exception;
import java.util.Scanner;
class invalidnum2 extends Exception
{
  public String toString()
  {
	  return"Number is Small:";
  }
}
class invalidnum3 extends Exception
{
  public String toString()
  {
	  return"Number is Greater:";
  }
}
public class Number3
{
 public static void main(String[] args)
 {
	 try
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number:");
		 int n=sc.nextInt();
		 if(n<=5)
			 throw new invalidnum2();
		 if(n>=10)
			 throw new invalidnum3();
		 int s=1;
		 for(int i=1;i<=n;i++)
		 {
		  s=s*i;
		 }
		 
		 System.out.println("Factorial="+s);
	 }catch(Exception e)
	 {
		 System.out.println("Error!"+e);
	 }
 }
}

