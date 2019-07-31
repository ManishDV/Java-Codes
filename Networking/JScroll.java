import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JScroll {

	public JScroll() {
		// TODO Auto-generated constructor stub
		JFrame f=new JFrame("ScrollPane");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,400);
		f.setVisible(true);
		//f.setLayout(null);
		JPanel p1=new JPanel();
		JPanel main=new JPanel();

		//main.setBounds(400,100,600,400);
		GridLayout gl=new GridLayout(20,20);
		p1.setLayout(gl);
		f.add(p1);
		
		main.add(p1);
		for(int i=1;i<=400;i++)
		{
			p1.add(new JButton(Integer.toString(i)));
		}
		
		int vsb=JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED;
		int hsb=JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp=new JScrollPane(p1,vsb, hsb);
		f.add(jsp);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JScroll();
	}

}
