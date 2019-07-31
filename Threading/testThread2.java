import java.util.*;
class Add extends Thread
{int n1,n2,ans;

public	Add(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
		System.out.println("...................In Add Constructor.....................");
		
	}
	public void run()
	{
		try{
		      Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("..................In Run Method..................");
		sum(n1,n2);
	}
	public void sum(int n1,int n2)
	{
		try
		{
	         Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("...............In Sum Method..............");
		ans=n1+n2;
		display();
	}
	public void display()
	
	{
		try{
			 Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		
		System.out.println("The Addition is :" +ans);
	}
}
class testThread2
{
	public static void main(String args[])
	{
		System.out.println("..................In Main Method..................");
		int n1=10;
		int n2=20;
		Add t1=new Add(n1,n2);
		t1.start();
	}	
}