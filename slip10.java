package Slips;
import java.util.*;
public class slip10
{
   int eid,sal;
   String name,desg;
   void accept()
   {
	   Scanner sc=new Scanner(System.in);
		System.out.println("Enter the emp id:");
		eid=sc.nextInt();
		System.out.println("Enter the emp name:");
		name=sc.next();
		System.out.println("Enter the emp designation:");
		desg=sc.next();
		System.out.println("Enter the emp salary:");
		sal=sc.nextInt();
   }
   public String toString()
   {
	   return "Emp id="+eid+"\n"+"Emp name"+name+"\n"+"Emp designation="+desg+"\n"+"Emp sal="+sal;
   }
	public static void main(String[] args)
	{
		slip10 ob=new slip10();
		ob.accept();
		System.out.println(ob);

	}

}
