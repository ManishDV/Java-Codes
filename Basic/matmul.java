import java.util.*;
class matmul
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m1[][],m2[][],m3[][],n,i,j,k;
		
		System.out.println("Enter the number of rows and coloumns for matrix:");
		n=sc.nextInt();
		m1=new int[n][n];
		m2=new int[n][n];
		m3=new int[n][n];
		System.out.println("Enter the elements for matrix1:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements for matrix2:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				m2[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				for(k=0;k<n;k++)
				{
					m3[i][j]=m3[i][j]+m1[i][k]*m2[k][j];
				}
			}
		}
		System.out.println("MULTIPLICATION OF MATRIX IS:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(m3[i][j]+"  ");
		
			}
			System.out.println("\n");
		
		}
		
	}
}