import java.io.*;
class concat
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream file1=new FileInputStream("text1.txt");
		FileInputStream file2=new FileInputStream("text2.txt");
		SequenceInputStream file3=new SequenceInputStream(file1,file2);
		BufferedInputStream inBuffer=new BufferedInputStream(file3);
		BufferedOutputStream outBuffer=new BufferedOutputStream(System.out);
		int ch;
		while((ch=inBuffer.read())!=-1)
		{
			outBuffer.write((char)ch);
		}
		inBuffer.close();
		outBuffer.close();
		file1.close();
		file2.close();
	}
}