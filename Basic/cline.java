import java.util.*;
class cline 
{
	public static void main(String args[])
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum+=Integer.parseInt(args[i]);
		}
		System.out.println("sum of five number is:"+" "+sum);
	}
}