import java.util.*;
class vector1
{
	public static void main(String args[])
	{
		Vector list=new Vector();
		int length=args.length;
		for(int i=0;i<length;i++)
		{
			list.addElement(args[i]);
			
		}
		list.insertElementAt("COBOL",2);
		int size=list.size();
		String listA[]=new String[size];
		list.copyInto(listA);
		System.out.println("LIST OF LANGUAGES :");
		for(int i=0;i<size;i++)
		{
			System.out.println(listA[i]);
		}
		
	}
}