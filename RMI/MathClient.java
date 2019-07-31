import java.rmi.*;
import java.io.*;

public class MathClient
{
	public static void main(String args[]) throws Exception
	{
		String url="rmi://"+args[0]+"/brainiac";
		MathServices ms=(MathServices)Naming.lookup(url);
		float[] addUs={10,20};
		float sum=ms.add(addUs);
		float[] subtractUs={99.99f,23.76f};
		float difference=ms.subtract(subtractUs);
		System.out.println("Sum is:"+sum);
		System.out.println("Difference is:"+difference);
	}
}