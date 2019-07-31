import java.util.*;
class stringbuff
{
	public static void main(String args[])
	{
		StringBuffer str=new StringBuffer("Object language");
		System.out.println("Original string is:"+str);
		System.out.println("Length of the string:"+str.length());
		int process=str.indexOf("language");
		str.insert(process,"Oriented");
		System.out.println("Modified String is:" + str);
		str.setCharAt(6,'-');
		System.out.println("String Now:" +str);
		str.append("Improves Security");
		System.out.println("Appended String is :" +str);
	}
}