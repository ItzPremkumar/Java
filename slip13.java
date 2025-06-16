package Slips;

import java.util.Scanner;

class product
{
	int pid,pcost,quantity;
	String name;
	static int obcount;
	public product() 
	{
		pid=00;
		name="";
		pcost=00;
		quantity=00;
	}
	public product(int pid,String name,int pcost,int quantity)
	{
		this.name=name;
		this.pcost=pcost;
		this.pid=pid;
		this.quantity=quantity;
	}
	void disp()
	{
		System.out.println("object count="+(++obcount));
		System.out.println("id="+pid);
		System.out.println("name="+name);
		System.out.println("cost="+pcost);
		System.out.println("quantity="+quantity);
	}
}
public class slip13 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		product ob[]=new product[10];
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter the id name cost quantity:");
			int id=sc.nextInt();
			String name=sc.next();
			int cost=sc.nextInt();
			int quantity=sc.nextInt();
			ob[i]=new product(id,name,cost,quantity);
		}
		for(int i=0;i<2;i++)
		{
			ob[i].disp();
		}

	}

}
