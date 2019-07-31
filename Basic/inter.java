import java.util.*;
interface area
{
	float pi=3.14f;
	float compute(float x,float y);
}
class rectangle implements area
{
	public float compute(float x,float y)
	{
		return ((int)x*y);
	}
} 
class circle implements area
{
	public float compute(float x,float y)
	{
		return ((int)pi*x*x);
	}
}
class inter 
{
	public static void main(String args[])
	{
		rectangle rect=new rectangle();
		circle cir=new circle();
		area a1;
		a1=rect;
		System.out.println("The Area Of Rectangle is:" +a1.compute(1.34f,4.65f));
		a1=cir;
		System.out.println("The area of circle is:" +a1.compute(10,0));
	}
}