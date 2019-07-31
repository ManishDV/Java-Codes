import java.util.*;
class shape
{
  int l,b,r,s;
  float Area;
  void area(int s)
{
   Area=s*s;
   System.out.println("The Area Of Square is:" +Area);
}
 void area(float r) 
{	
    float a=3.14f;
    Area=a*r*r;
     System.out.println("The Area Of Circle is:" +Area);
}
 void area(float l,int b)
{
    Area=l*b;
    System.out.println("The Area Of Rectangle is:" +Area);
}

public static void main(String args[])
{
    shape s1=new shape();
  s1.area(5);
shape s2=new shape();
s2.area(5.77f);
shape s3=new shape();
s3.area(6.88f,11);
}
}