package Slips;

public class slip2 
{
 public static void main(String[] args)
 {
	System.out.println("Even number =");
	for(int i=0;i<args.length;i++)
	{
		int n=Integer.parseInt(args[i]);
		if(n%2==0)
		{
			System.out.println(" "+n);
		}
	}
 }
}
