import java.util.Scanner;
class menu
{
	public static void main(String args[])
{
  	int ch,i,or;
	String starter[]={"S1","S2","S3"};
	int sprice[]={100,200,300};
	int sum=0;
	String custor[]=new String[10];
	int custbil[]=new int[10];
	String vegmenu[]={"V1","V2","V3"};
	int vprice[]={200,250,300};
	int j=0;
	do
	{
		System.out.println("1.STARTER\n2.VEG");
 		System.out.println("Give your order SIR..");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		System.out.println("ORDER""\t""MENU""\t""PRICE");
		switch(ch)
		{
		case 1:
		for(i=0;i<starter.length;i++)
			{
				System.out.println((i+1)+"\t\t" +starter[i]+"\t\t"+sprice[i]);
			}
		System.out.println("Enter Your Order");
		or=new.nextInt();
		for(i=0;i<starter.length;i++)
		{
			if((or-1)==i)
			{
				custor[j]=starter[i];
				custbill[j]=sprice[i];
				j++;
				break;
			}
		}
                   break;
                   System.out.println("Do you want to continue");
