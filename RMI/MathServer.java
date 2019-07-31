import java.rmi.*;
import java.net.*;
import java.rmi.registry.*;
public class MathServer 
{
	public static void main(String args[]) throws Exception
	{
		try{
	ServerSocket ss=new ServerSocket(7777);
	Socket s=ss.accept();
		Registry reg=LocateRegistry.createRegistry(8888);
		System.setProperty("java.rmi.server.hostname","192.168.43.22");
		Mathematician m=new Mathematician();
		reg.rebind("brain",m);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}