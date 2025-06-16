package okk;
interface Interger
{
	void check(int n);
}
class Positive implements Interger
{
	public void check(int n)
	{
		if(n>=0)
			System.out.println("Positive");
	}
}
class Negative implements Interger
{
	public void check(int n)
	{
		if(n<0)
			System.out.println("Negative");
	}
}
public class Demo1 
{

	public static void main(String[] args)
	{
		Positive ob=new Positive();
		Negative ob1=new Negative();
		ob.check(2);
		ob1.check(-1);

	}

}
