package Slips;
import java.util.*;

public class slip6
{

	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the limit:");
	 int n=sc.nextInt();
	 String sr[]=new String[n];
	 System.out.println("Enter the n citi names:");
	 for(int i=0;i<n;i++)
	 {
		 sr[i]=sc.next();
	 }
	 for(int i=0;i<sr.length;i++)
	 {
		 for(int j=0;j<sr.length;j++)
		 {
			 if(sr[i].compareTo(sr[j])<0)
			 {
				 String t=sr[i];
				 sr[i]=sr[j];
				 sr[j]=t;
			 }
		 }
	 }
	 System.out.println("Sorted cities=");
	 for(String t:sr)
	 {
		 System.out.println(t);
	 }

	}

}
