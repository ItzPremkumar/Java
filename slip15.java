package Slips;
import java.util.*;

public class slip15
{  
	Scanner sc=new Scanner(System.in);
	int rno,per;
	String name;
	void accept()
	{
		System.out.println("ENter the id name per:");
		rno=sc.nextInt();
		name=sc.next();
		per=sc.nextInt();
	}
	void disp()
	{
		System.out.println("roll no name per:"+rno+"\n"+name+"\n"+per);
	}
	static void sort(int n,slip15 ob[])
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(ob[i].per<ob[j].per)
				{
					slip15 t=ob[i];
					ob[i]=ob[j];
					ob[j]=t;
				}
					
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit:");
		int n=sc.nextInt();
		slip15 ob[]=new slip15[n];
		for(int i=0;i<n;i++)
		{
			ob[i]=new slip15();
			ob[i].accept();
		}
		slip15.sort(n, ob);
		for(int i=0;i<n;i++)
		{
			ob[i].disp();
			ob[i].accept();
		}
		// TODO Auto-generated method stub

	}

}
