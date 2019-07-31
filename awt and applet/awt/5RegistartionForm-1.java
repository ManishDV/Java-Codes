import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
public class RegistartionForm implements ActionListener
{
	JFrame f;
	JPanel p;
	JLabel lno1,lno2,lans;
	JTextField tno1,tno2,tans;
	
	JButton badd,bsub,bmul,bdiv,breset,bexit;
	public RegistartionForm()
	{
		f=new JFrame("Caculator Ver 2017");
		f.setSize(400,400);
		f.setVisible(true);
		p=new JPanel();
		f.add(p);
		p.setBackground(Color.yellow);
		
		GridLayout gl=new GridLayout(6,2,5,5);
		p.setLayout(gl);
		lno1=new JLabel("Number1");
		lno2=new JLabel("Number2");
		lans=new JLabel("Ans");
		
		tno1=new JTextField(10);
		tno2=new JTextField(10);
		tans=new JTextField(10);
		//tno1.setBackground(Color.red);
		
		
		badd=new JButton("+");
		bsub=new JButton("-");
		bmul=new JButton("*");
		bdiv=new JButton("/");
		breset=new JButton("C");
		bexit=new JButton("EXIT");
		
		p.add(lno1);
		p.add(tno1);
		p.add(lno2);
		p.add(tno2);
		p.add(lans);
		p.add(tans);
		p.add(badd);
		p.add(bsub);
		p.add(bmul);
		p.add(bdiv);
		p.add(breset);
		p.add(bexit);
		
		
		badd.addActionListener(this);
		breset.addActionListener(this);
		
	}
	public static void main(String[] args) {
		RegistartionForm r=new RegistartionForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==badd)
		{
		String s1=tno1.getText();
		String s2=tno2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int add=n1+n2;
		
		tans.setText(Integer.toString(add));
		}
		if(e.getSource()==breset)
		{
			tno1.setText("");
			tno2.setText("");
			tans.setText("");
		}
		if(e.getSource()==bexit)
		{
			System.exit(0);
		}
	}
}
