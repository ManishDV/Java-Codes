import java.net.*;
import java.io.*;

public class ClientEx
{
	public static void main(String args[]) throws Exception
	{
		try
		{
			Socket s=new Socket("localhost",7788);
			String str1="",str2="";
			System.out.println("..............Client is ready for Chatting..........");
			PrintWriter pw=new PrintWriter(s.getOutputStream());
			System.out.println("..............Client is ready for Chatting..........");
			
			while(s.getInputStream()!=null)
			{
				if(str2.equals("stop"))
				{
					s.close();
					}
				System.out.println("..............Client is ready for Chatting..........");
			
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter Message For Server");
				str1=br.readLine();
				
				pw.println(str1);
				pw.checkError();
				pw.flush();
				BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
				str2=br1.readLine();
				System.out.println("Server Says :"+str2);
				
			}
			
		}
			
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
				
			