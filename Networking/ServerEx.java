import java.net.*;
import java.io.*;

public class ServerEx
{
	public static void main(String args[])
	{
		try
		{
			
		ServerSocket ss=new ServerSocket(7788);
		Socket s=ss.accept();
		System.out.println("..............Server is ready for Chatting..........");
		PrintWriter pw=new PrintWriter(s.getOutputStream());
		String str1="",str2="";
		while(s.getInputStream()!=null)
		{
			if(str1.equals("stop"))
			{
					ss.close();
		s.close();
		
			}
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			str1=br.readLine();
			System.out.println("Client Says :"+str1);
			
			BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("...............Enter Message For Client:..............");
			str2=br1.readLine();
			pw.println(str2);
			pw.checkError();
			pw.flush();
		}
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}