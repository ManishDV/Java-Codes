import java.beans.*;
import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import java.awt.event.*;

public class LabelProp extends JPanel implements java.io.Serializable
{
	JLabel l1;
	
	
	private String caption="SEND";
	
	
	public LabelProp()
	{
		l1=new JLabel("SEND");
		add(l1);
	}
	public String getCaption()
	{
		return caption;
	}
	
	public void setCaption(String s)
	{
		caption=s;
		l1.setText(caption);
	}
	
}