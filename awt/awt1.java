import java.awt.*;
import javax.awt.*;
import java.awt.event.*;
public class calc implements ActionListener
{
	Frame f;
	JLabel lno1;lno2;lans;
    JTextField tno;
    JButton badd,bsub,bmul,bdiv,bmod;
    public calc()
	{
				f=new Frame("Notepad");
				BorderLayout bl=new BorderLayout();
				f.setLayout(bl);
	}
}