import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Socket s;
		ServerSocket ss;
		BufferedReader br,br2;
		String str="",str1="";

		// TODO Auto-generated constructor stub
		try{
		ss=new ServerSocket(7744);
		s=ss.accept();
				while(str.equals("stop"))
				{
						br=new BufferedReader(new InputStreamReader(s.getInputStream()));
						str=br.readLine();
						System.out.println("Client says:"+str);
						PrintWriter pw=new PrintWriter(s.getOutputStream());
						br2=new BufferedReader(new InputStreamReader(System.in));
						System.out.println("Enter Msg For Client:");
						str1=br2.readLine();
						pw.println(str1);
						pw.checkError();
						System.out.println("");
				}
				
		s.close();
		ss.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	}


