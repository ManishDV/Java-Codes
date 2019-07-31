import java.net.*;
import java.io.*;

public class UDPClient
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DatagramSocket clientSocket=new DatagramSocket();
		InetAddress IPAddress=InetAddress.getByName("localhost");
		byte[] sendData=new byte[1024];
		byte[] receiveData=new byte[024];
		String msg=br.readLine();
		sendData=msg.getBytes();
		DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,IPAddress,9876);
		clientSocket.send(sendPacket);
		DatagramPacket receivePacket=new DatagramPacket(receiveData,receiveData.length);
		clientSocket.receive(receivePacket);
		String reply=new String(receivePacket.getData());
		System.out.println("FROM SERVER:"+reply);
		clientSocket.close();
	}
}