package Slips;
import java.util.*;

public class slip1 
{

	public static void main(String[] args) 
	{
		System.out.println("Prime number=:");
		for(int i=0;i<args.length;i++)
		{
			int j;
			int n=Integer.parseInt(args[i]);
			for(j=2;j<n;j++)
			{
				if(n%j==0)
					break;
				if(j==n)
				{
					System.out.println(" "+args[i]);
				}
			}
	
		}
	}

}
