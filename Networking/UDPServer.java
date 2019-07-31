import java.io.*;
import java.net.*;

public class UDPServer
{
	public static void main(String args[]) throws Exception
	{
		DatagramSocket serverSocket=new DatagramSocket(9876);
		byte[] receiveData=new byte[1024];
		byte[] sendData=new byte[1024];
		while(true)
		{
			DatagramPacket receivePacket=new DatagramPacket(receiveData,receiveData.length);
			serverSocket.receive(receivePacket);
			String msg=new String(receivePacket.getData());
			System.out.println("RECEIVED:"+msg);
			InetAddress ip=receivePacket.getAddress();
			int port=receivePacket.getPort();
			String res=msg.toUpperCase();
			sendData=res.getBytes();
			DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,ip,port);
			serverSocket.send(sendPacket);
		}
	}
}
