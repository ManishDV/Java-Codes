import java.util.*;
class sort
{
	public static void main(String args[])
	{
		int num[]={55,40,80,65,71};
		int n=num.length;
		System.out.println("Sorted list is");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(num[i]<num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print("  "+num[i]);
		}
		System.out.print(" ");
	}
}