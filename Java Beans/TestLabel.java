import java.beans.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
public class TestLabel extends JPanel
{
    JLabel label;
    private String caption="Send";
    private Color backgroundColor=Color.WHITE;
    private Color TextColor=Color.BLACK;

    
    public TestLabel()
    {
      label=new JLabel("Send");
      add(label);
      
     }
   
     public String getCaption()
     {
		return caption;
     }
     public void setCaption(String str)
     {
          caption=str;
          label.setText(caption);
      }
      public Color getBackgroundColor()
	{
    		return backgroundColor;
	}
      public void serBackgroundColor(Color c1)
	{
  		backgroundColor=c1;
		label.setBackground(backgroundColor);
 	}
        public Color getTextColor()
{
     return TextColor;
}
public void setTextColor(Color c2)
{
   TextColor=c2;
   label.setForeground(TextColor);
}

}