import java.util.*;
class One1
{
	public static void main(String args[])
{
    int arr[],n,i,sum=0,j=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("no of element in array=");
n=sc.nextInt();
arr=new int[n];
System.out.println("enter elements in array=");
for(i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
 if((arr[i]%3==0)||(arr[i]%5==0))
{

    j++;
   sum=sum+arr[i];
}
}
System.out.println("total divisible numbers are=" +j);
System.out.println("sum of the divisible numbers=" +sum);
}
}