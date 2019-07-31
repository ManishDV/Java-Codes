import java.beans.*;
import java.awt.*;

public class Test2 extends Panel
{
	private String label="Hello";
	Label l1;
	public Test2()
{
	l1=new Label("Hello");
	add(l1);
}
public String getLabel()
{
	return label;
}
public void setLabel(String s)
{
    label=s;
	   l1.setText(label);
}
}