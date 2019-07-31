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
    Area=3.14*r*r;
     System.out.println("The Area Of Circle is:" +Area);
}
 void area(float l,int b)
{
    Area=l*b;
    System.out.println("The Area Of Rectangle is:" +Area);
}

public static void main(String args[])
{
    shape s1=new shape(5);
shape s2=new shape(5.5f);
shape s3=new shape(8.9f,9);
}
