package Slips;

public class slip {

	public static void main(String[] args) 
	{
	 System.out.println("Odd number=");
	 for(int i=0;i<args.length;i++)
	 {
		 int n=Integer.parseInt(args[i]);
		 if(n%2==1)
			 System.out.println(" "+n);
	 }

	}

}
