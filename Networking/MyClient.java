import java.io.*;
import java.net.*;

public class MyClient {
Socket s;
BufferedReader br,br1;
String msg,str2;
		public MyClient()
		{
			try{
				s=new Socket("localhost",7744);
				
				while(s.getInputStream()!=null)
				{
				br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter msg for Server:");
				msg=br.readLine();
			
				PrintWriter pw=new PrintWriter(s.getOutputStream());
				pw.println(msg);
				pw.checkError();
			
				br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
				 str2=br1.readLine();
				System.out.println("server Says:"+str2);
				System.out.println("");
				}
				s.close();
				
			}	
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyClient();
	}

}
