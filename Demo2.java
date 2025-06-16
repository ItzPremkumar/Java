package okk;
interface Shape
{
 void area(float r);
 final float P=3.14f;
}
class Circle implements Shape
{
 public void area(float r)
 {
	 float s=P*r*r;
	 System.out.println("Area of Circle="+s);
 }
}
class Sphare implements Shape
{
 public void area(float r)
 {
	 float a=4*P*r*r;
	 System.out.println("Area of Sphere="+a);
 }
}
public class Demo2 {

	public static void main(String[] args)
	{
		Circle ob=new Circle();
		Sphare ob1=new Sphare();
		ob.area(2.3f);
		ob1.area(5.5f);

	}

}
