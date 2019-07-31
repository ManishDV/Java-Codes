import java.util.*;
class TwoD
{ 
          public static void main(String args[])
         {	 
	int m1[ ][ ],m2[ ][ ],m3[ ][ ],r,c,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number Of Rows And Columns You Want In Matrix 1:");
	r=sc.nextInt();
	c=sc.nextInt();
   	m1=new int[r][c];
	System.out.println("--------------------------------------Enter The Elements In Matrix 1---------------------------------------");
	for(i=0;i<m1.length;i++) 
	{
		for(j=0;j<m1[i].length;j++)
		{
			m1[i][j]=sc.nextInt();
  		}
	}	

                 System.out.println("Enter The Number Of Rows And Columns You Want In Matrix 2:");
	r=sc.nextInt();
	c=sc.nextInt();
   	m2=new int[r][c];
	System.out.println("---------------------------------Enter The Elements In Matrix 2-----------------------------------");
	for(i=0;i<m1.length;i++)
	{
		for(j=0;j<m1[i].length;j++)
		{
			m2[i][j]=sc.nextInt();
  		}
	}	        
	m3=new int[r][c];
	if(m1.length==m2.length)
	{
                           
		
		for(i=0;i<m1.length;i++)
		{
			for(j=0;j<m1[i].length;j++)
			{
				 m3[i][j]=m1[i][j]+m2[i][j];
			}
		}
                              	System.out.println("-------------------------------------ADDITION OF MATRIX 1&2-------------------------------------");
		for(i=0;i<m1.length;i++)
		{
			for(j=0;j<m1[i].length;j++)
			{
				System.out.print(m3[i][j] +"\t");
			}
		}
			System.out.println("");
                              	
	}
	
	
	else
	{
		System.out.println("-------------------------------------ADDITION IS NOT POSSIBLE-----------------------------------");

	}

	}
}