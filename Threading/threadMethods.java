class A extends Thread
{
	public void run()
	{
	    for(int i=0;i<5;i++)
		{
			if(i==1)
				yield();
			try
			{
			sleep(3000);
			}
			catch(Exception e)
			{
				
			}
			System.out.println("The value of I in class A is I=" +i);
		}
		System.out.println("Exit From A");
	}
	
}
class B extends Thread
{
	public void run()
	{
		for(int j=0;j<5;j++)
		{   
			try{
					sleep(3000);
			}
			catch(Exception e)
			{
				
			}
			System.out.println("The value of J in class B is J=" +j);
			if(j==3)
		     stop();
		}
		System.out.println("Exit from B");
	}
	
}
class C extends Thread
{
	public void run()
	{
		for(int k=0;k<5;k++)
		 System.out.println("The value of K in class C is K=" +k);
	    try
		{
			sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("Exit from C");
	}
	
}
class threadMethods
{
	public static void main(String args[])
	{
		A threadA=new A();
		B threadB=new B();
		C threadC=new C();
		System.out.println("Calling Thread A");
		threadA.start();
		System.out.println("Calling Thread B");
		threadB.start();
		System.out.println("Calling Thread c");
		threadC.start();
		System.out.println("End of main");
	}
}