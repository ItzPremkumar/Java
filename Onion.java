package okk;
import java.util.*;
public class Onion {

	public static void main(String[] args) 
	{
		float c;
		Scanner sc=new Scanner(System.in);
		System.out.println("==============================");
		System.out.println("Enter the NET. Weight:");
		float n=sc.nextFloat();
		
		System.out.println("==============================");
		System.out.println("Enter the Total Bages:");
		int b=sc.nextInt();
		System.out.println("==============================");
		float we=n-b;
		System.out.println("Enter the Rate:");
		Float r=sc.nextFloat();
		System.out.println("==============================");
		float re=we*r;
		System.out.println("Your Amount is:"+re);
		System.out.println("==============================");
		System.out.println("Enter the Katla persentage:");
		float k=sc.nextFloat();
		System.out.println("==============================");
	    c=(re*k)/100;
	    System.out.println("Your कटला amount is:"+c);
	    System.out.println("==============================");
	    float am=re-c;
	    System.out.println("Your Amount is:"+am);
	    System.out.println("==============================");
	    double v= n*(0.50); 
	    System.out.println("Your 0.50 Commition is:"+v);
		
	}

}
