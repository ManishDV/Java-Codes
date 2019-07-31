import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import java.awt.event.*;
import java.beans.*;
public class TestBean extends JPanel implements java.io.Serializable
{
	JLabel jlt;
	JButton b;
	
	private String caption="SEND";
	
	
	public TestBean()
	{
		jlt=new JLabel("SEND");
		add(jlt);
	}
	public String getCaption()
	{
		return caption;
	}
	
	public void setCaption(String s)
	{
		caption=s;
		jlt.setText(caption);
	}
	
}