import java.rmi.*;

public interface MathServices extends Remote
{
	public float add(float[] addUs) throws RemoteException;
	public float subtract(float[] subtractUs) throws RemoteException;
}
