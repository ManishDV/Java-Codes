import java.rmi.*;
import java.io.*;
import java.rmi.server.UnicastRemoteObject;

public class Mathematician  extends UnicastRemoteObject implements MathServices

	{
		public Mathematician() throws Exception 
		{}
		
		public float add(float[] addUs)
		{
			return addUs[0]+addUs[1];
		}
		
		public float subtract(float[] subtractUs)
		{
			return subtractUs[0]-subtractUs[1];
		}
	}
