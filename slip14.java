package Slips;
import java.util.*;
interface cubic
{
  abstract int cube(int n);	
}

public class slip14
{

	public static void main(String[] args) 
	{
	   int a=2;
		cubic c=(int n)->n*n*n;
		int ans=c.cube(a);
		System.out.println(" "+ans);
		
	}

}
