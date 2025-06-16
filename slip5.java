package Slips;
import java.util.*;
class cricket
{
  int inning,notout,totalrun,batavg;
  String name;
  Scanner sc=new Scanner(System.in);
  void accept()
  {
	 System.out.println("Enter the name of player:");
	 name=sc.next();
	 System.out.println("Enter the innings:");
	 inning=sc.nextInt();
	 System.out.println("Enter the totalrun:");
	 totalrun=sc.nextInt();
	 System.out.println("Enter the notout:");
	 notout=sc.nextInt();
  }
  void disp()
  {
	  System.out.println("name of player:"+name);
	  System.out.println("innings:"+inning);
	  System.out.println("totalrun:"+totalrun);
	  System.out.println("notout:"+notout);
	  System.out.println("Batting average:"+batavg);
  }
  static void avg(int n,cricket ob[])
  {
	for(int i=0;i<n;i++)
	{
	 ob[i].batavg=ob[i].totalrun/ob[i].inning;	
	}
  }
  static void sort(int n,cricket ob[])
  {
	  for(int pass=0;pass<n;pass++)
	  {
		  for(int i=pass+1;i<n;i++)
		  {
			  if(ob[pass].batavg<ob[i].batavg)
			  {
				  cricket t=ob[pass];
				  ob[pass]=ob[i];
				  ob[i]=t;
			  }
		  }
	  }
  }
}
public class slip5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=sc.nextInt();
       cricket ob[]=new cricket[n];
       for(int i=0;i<n;i++)
       {
    	   ob[i]=new cricket();
    	   ob[i].accept();
       }
      cricket.avg(n,ob);
      cricket.sort(n,ob);
      for(int i=0;i<n;i++)
      {
    	  ob[i].disp();
      }
	}

}
