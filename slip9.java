package Slips;
import java.util.*;
public class slip9 
{
	public static void main(String[] args) 
  	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column:");
		int n=sc.nextInt();
	  int a[][]=new int[n][n];
	  int b[][]=new int[n][n];
	  int c[][]=new int[n][n];
	  System.out.println("Enter first matrix:");
	  for(int i=0;i<n;i++)
	  {
		  for(int j=0;j<n;j++)
		  {
			  a[i][j]=sc.nextInt();
		  }
	  }
	  System.out.println("Enter Second matrix:");
	  for(int i=0;i<n;i++)
	  {
		  for(int j=0;j<n;j++)
		  {
			  b[i][j]=sc.nextInt();
		  }
	  }
	  int ch = 0;
	  do 
	  {
		 System.out.println("1:Addition");
		 System.out.println("2:Multiplication");
		 System.out.println("3:Exit");
		 ch=sc.nextInt();
		 switch(ch)
		 {
		  case 1:for(int i=0;i<n;i++)
		  {
			  for(int j=0;j<n;j++)
			  {
				  c[i][j]=a[i][j]+b[i][j];
			  }
		  }
		 
		 System.out.println("Addition=");
		 for(int i=0;i<n;i++)
		  {
			  for(int j=0;j<n;j++)
			  {
				 System.out.print(c[i][j]+" ");
			  }
			  System.out.println( );
		  }
		 
		 break;
	  case 2:for(int i=0;i<n;i++)
	  {
		  for(int j=0;j<n;j++)
		  {
			  c[i][j]=0;
			  for(int k=0;k<n;k++)
			  {
				  c[i][j]=c[i][j]+a[i][j]*b[i][j];
			  }
		  }
	  
	  }
	 System.out.println("Addition=");
	 for(int i=0;i<n;i++)
	  {
		  for(int j=0;j<n;j++)
		  {
			 System.out.print(c[i][j]+" ");
		  }
		  System.out.println( );
	  }
	 
	 break;
		 }
	  }while (ch!=3);
		
	}

}
