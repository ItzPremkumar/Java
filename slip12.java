package Slips;

public class slip12 
{
	void area(int r)
	{
		System.out.println("Surface area ="+4*(3.14)*(r*r));
	}
	void volume(int r)
	{
		System.out.println("Surface area ="+(4/3)*(3.14)*(r*r*r));
	}

	public static void main(String[] args) 
	{
		slip12 ob=new slip12();
		ob.area(10);
		ob.volume(22);

	}

}
