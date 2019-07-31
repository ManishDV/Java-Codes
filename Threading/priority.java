import java.util.*;
class Demo extends Thread
{
	private String str;
	public Demo(String str)
	{
			this.str=str;
	}
	public void run()
	{
		System.out.println("IN RUN METHOD"+" "+str);
	}
}
class priority
{
	 public static void main(String args[])
	 {
		 Demo d1=new Demo("JAVA");
		 Demo d2=new Demo("ORACLE");
		 d1.start();
		 d2.start();
		 d1.setName("IMPORTANT");
		 d2.setName("TIMEPASS");
		 d1.setPriority(3);
		 d2.setPriority(9);
		 System.out.println("...................................................IN MAIN.....................................................");
		 System.out.println("THE FIRST THREAD IS"+" "+d1);
		 System.out.println("THE SECOND THREAD IS"+" "+d2);
	 }
}