import java.io.*;
class copychar
{
	public static void main(String args[]) throws Exception
	{
		File infile=new File("input.txt");
		File outfile=new File("output.txt");
		FileReader ins=null;
		FileWriter outs=null;
		ins=new FileReader(infile);
		outs=new FileWriter(outfile);
	     int  ch=ins.read();
	 while(ch!=-1)
	 {
		 outs.write((char)ch);
	 }
	 ins.close();
	 outs.close();
	}
	
}