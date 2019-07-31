
import java.util.*;
interface car{
              String getcolor();
			  String getmodel();
			  double getprice();
			 
			 }
			 
    class maruti implements car{
								
								public String getmodel()
								{	
												String a[]={"Alto 800","Vitara Brezza","Ertiga","S-cross","Ciaz","A-star","Wagonar","Swift"};
												int q=0;
												if(q==9)
												{
													System.out.println("More items are not available");
												}
												else
												{
													for(q=0;q<8;q++)
													{
														return a[q];
													}
												}
												
													
							}
										public String getcolor()
										{
								
											int q=0;
											String b[]={"White","Black","Green","Yellow","Gray","White","Blue","Red"};
											
											return b[q]; 
										}
								public double getprice()
								{
									
									int q=0;
									double c[]={300000,800000,550000,600000,750000,800000,450000,600000};
									return c[q];
								}
							}
	
								
	class toyota implements car{
								public String getmodel(){
										
								     String d[]={"Toyota 86","Corolla Altis","Fortuner","Toyota Mirai","Pirus","Toyota Cammet Sora","Toyota FCV","Etios"};
										
										int q=0;
										return d[q];
										
									 }
								public String getcolor(){
										int q=0;
									 String e[]={"White","Black","Green","Yellow","Gray","White","Blue","Red"};
									 return e[q];
								  }
								public double getprice(){
										int q=0;
								    double f[]={300000,800000,550000,600000,750000,800000,450000,600000};
									return f[q];
								   }
								}
    public  class automobile {
						public static void main(String args[])
						
						{
							Scanner sc=new Scanner(System.in);
							int q,j,k,ch;
							System.out.println("1.Maruti\n2.Toyota");
							System.out.println("\n\nEnter Your Choice:");
							ch=sc.nextInt();
							switch(ch)
							{
								case 1:
									car g=null;
									g=new maruti();
							      do{
							  
										System.out.println("-----------------------------!!!!!!!!!!MARUTI CARS!!!!!!!!!!!----------------------------------\n\n");
										System.out.println("-----------------------------------------------------------------------------------------------");
										System.out.println("SR.NO\t \t"+"MODEL\t\t"+"\tCOLOUR\t \t"+"PRICE \t");
										System.out.println("-----------------------------------------------------------------------------------------------");
										for(q=0;q<8;q++)
									{
										System.out.println((q+1)+"\t\t"+g.getmodel()+"\t\t"+g.getcolor()+"\t\t"+g.getprice());
									}
								  }while(q>8);
								  break;
								case 2:
										g=new toyota();
										do{
										System.out.println("\n\n----------------------------!!!!!!!!!!!!!!!TOYOTA CARS!!!!!!!!!!!!!-----------------------------\n\n");
										System.out.println("------------------------------------------------------------------------------------------------");
										System.out.println("SR.NO\t \t"+"MODEL\t\t"+"\tCOLOUR \t\t"+"PRICE \t");
										System.out.println("-----------------------------------------------------------------------------------------------");
										for(q=0;q<8;q++)
										{
						        
									      System.out.println((q+1)+"\t\t"+g.getmodel()+"\t\t"+g.getcolor()+"\t\t"+g.getprice());
										}
								}while(q>8);
					}
						}
	}