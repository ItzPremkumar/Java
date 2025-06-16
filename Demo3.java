package okk;
interface Oprations
{
	final float pi=3.14f;
	void volume(float r,float h);	
}
class circle implements Oprations
{
  public void volume(float r,float h)
  {
	  float v=pi*r*r*h;
	  System.out.println("Volume of circle="+v);
  }
}
class Cylinder implements Oprations
{
  public void volume(float r,float h)
  {
	  float c=pi*r*r*h;
	  System.out.println("Volume of cylinder="+c);
  }
}
class Cone implements Oprations
{
  public void volume(float r,float h)
  {
	  float vi=(1/3)*pi*r*r*h;
	  System.out.println("Volume of cone="+vi);
  }
}
public class Demo3 
{

	public static void main(String[] args)
	{
		circle ob=new circle();
		Cylinder ob1=new Cylinder();
		Cone ob3=new Cone();
		ob.volume(1.2f,3.6f);
		ob1.volume(4.5f,9.6f);
		ob3.volume(9.9f,6.6f);

	}

}
