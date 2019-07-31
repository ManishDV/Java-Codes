import java.util.*;
class Thread1
{    
    String str;
	synchronized void call(String str)
	{
		this.str=str;
		 System.out.println("This Is The First Part of Thread"+" "+str);
		 try
		 {
			 Thread.sleep(3000);
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception Caught" +e);
		 }
		 System.out.println("This Is The Second Part Of Thread"+" "+str);
		  try
		 {
			 Thread.sleep(3000);
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception Caught" +e);
		 }
	}
}
class Thread2 extends Thread
{
	Thread1 t;
	String str;
	public Thread2(Thread1 t,String str)
	{
		this.t=t;
		this.str=str;
	}
	public void run()
	{
		t.call(str);
	}
}
class synchronizedthreads
{
	public static void main(String args[])
	{
		Thread1 obj1=new Thread1();
		Thread2  obja=new Thread2(obj1,"JAVA");
		Thread2 objb=new Thread2(obj1,"ORACLE");
		obja.start();
		objb.start();
		obja.setName("Java");
		objb.setName("Oracle");
	}
}