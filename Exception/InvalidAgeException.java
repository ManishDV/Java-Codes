import java.util.*;
class InvalidAgeException extends Exception
{
	int age;
	public InvalidAgeException(int age)
	{
		this.age=age;
	}
	public String toString()
	{
		return "YOUR AGE IS"+" "+age+" "+"IS LESS THAN 18";
	}
}
class TestException
{
		public void display(int rno,String name,int age)
		{
			try
			{
				if(age<18)
				{
					throws new InvalidAgeException(age);
				}
				System.out.println("ROLL NUMBER:"+rno+" "+"NAME:"+name+" "+"AGE:"+age);
			}
			catch(InvalidAgeException e)
			{
				System.out.println("THE EXCEPTION IS"+e);
			}
		}
		
	public static void main(String args[])
	{
		int age;
		String name;
		int rno;
		Scanner sc=new Scanner(System.in);
		System.out.println("...............................WELCOME........................................");
		System.out.println("ENter the ROLL NUMBER,NAME and AGE");
		rno=sc.nextInt();
		name=sc.next();
		age=sc.nextInt();
		display(rno,name,age);
		System.out.println("...............................THANK YOU........................................")
	}
}