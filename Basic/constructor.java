import java.util.*;
class constructor
{
   public  int a,b;
       public constructor()
   {
	a=0;
	b=0;
	System.out.println("Value of a is="+a+"and b is=" +b);
                 System.out.println("This Is Default Constructor");
    }
    public constructor(int a,int b) 
{
		
	int area=a*b;
	System.out.println("The area is ="+area);
                 System.out.println("This Is Parametric Constructor");
}
public static void main(String args[])
{
   constructor C1=new constructor();
   constructor C2=new constructor(3,4);
   }
}