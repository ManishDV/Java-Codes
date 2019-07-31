import java.util.*;
class Constructor1
{ 
   int length,breadth;
   Constructor1()
{
    length=22;
    breadth=33;
     int  Area=length*breadth;
System.out.println("This is the default constructor\n\n");
     System.out.println("\n\nThe area is:" +Area);
}
 Constructor1(int l,int b)
{
    length=l;
    breadth=b;
    int Area=l*b;
System.out.println("This is the parametric constructor\n\n");
  System.out.println("\nThe area is:" +Area);
}
}
class testconstruct
{
    public static void main(String args[]) 
   {
      Constructor1 c1=new Constructor1();
      Constructor1 c2=new Constructor1(66,67);
   }
}  
	
		