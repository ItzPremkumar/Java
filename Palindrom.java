//CHECK NUMBER IS PALINDROM OR NOT AND CREATE EXCEPTION!!
package Exception;
import java.util.Scanner;
class checknumber extends Exception
{
  public String toString()
  {
	  return"Number is zero:";
  }
}
class checknumber3 extends Exception
{
  public String toString()
  {
	  return"this is not number:";
  }
}


public class Palindrom {

	public static void main(String[] args) {
		try
		 {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter the number:");
			 int n=sc.nextInt();
			 if(n==0)
				 throw new checknumber();
			 if(n=='A'||n=='a'||n=='Z'||n=='z'||n=='@')
				 throw new checknumber();
			 int s=0;
			 int num=n;
			 while(n>0)
			 {
		      int d=n%10;
		      s=s*10+d;
			  n=n/10;
			 }
			 if(num==s)
			 System.out.println("Number is palindrome :");
			 else
				 System.out.println("Number is not palindrome :");
		 }catch(Exception e)
		 {
			 System.out.println("Error!"+e);
		 }
		
	}

}
