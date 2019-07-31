import java.util.*;
class One
{
 	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[],n,i,j=0,sum=0;
		System.out.println("Enter The Number Of Elements You Want In Array= ");
		n=sc.nextInt();
		a=new int[n+1];
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		            if((a[i]%3==0)||(a[i]%5==0))
		{
			j++;
			sum=sum+a[i];
			
		}
	}
		
			System.out.println("The Total Numbers divisible By 3&5= " +j);
			System.out.println("The Sum Of "+j+"Numbers is= " +sum);
}	
}