import java.beans.*;
import java.io.*;
import java.io.Serializable;
import java.awt.*;
public class TestBeanProp extends Panel implements java.io.Serializable{

Label b1;
private String caption="Send";
public TestBeanProp()

{
	
  b1=new Label("Send");
  add(b1);
  }
  
  public String getCaption()
  {
     return caption;
 }
 public void setCaption(String s)
 {
   caption=s;
   b1.setText(caption);
  }
}
	 