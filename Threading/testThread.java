class Demo extends Thread
{
	public void run()
	{
		 System.out.println("Hello In Run.........");
		 display();
	}
	public void display()
	{
		 System.out.println("In Display..........");
	}
}
class testThread
{
	 public static void main(String args[])
	 {
		 Demo d=new Demo();
		 d.start();
		 System.out.println("In Main...........");
	 }
}