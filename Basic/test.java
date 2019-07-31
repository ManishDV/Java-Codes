import java.util.*;
class test{
        float a,b;
        float ans;
public void input()
{
        
}
        public void output(float a,float b)
{
           
         ans=a*b;
         System.out.println("Multiplication is=" +ans);
}
 public static void main(String args[])
{
float c,d;
      test t1=new test();
Scanner sc=new Scanner(System.in);
        System.out.println("Enetr your 2 floats=");
        c=sc.nextFloat();
	d=sc.nextFloat();
       
     t1.input();
	t1.output(c,d);
}
}