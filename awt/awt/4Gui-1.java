import java.awt.*;
import javax.swing.*;
class Gui
{
	Frame frm;
	Panel pnl;
	Label lbl,lfnm,llnm;
	TextField tfnm,tlnm;
	Button bsave;
	JButton bexit;

	public Gui()
	{
		frm=new Frame("Registration Form");
		frm.setSize(400,400);
		frm.setVisible(true);	

		pnl=new Panel();
		frm.add(pnl);

		pnl.setBackground(Color.yellow);
		
		lbl=new Label("Registration Form");
		pnl.add(lbl);
		
		Font f1=new Font("Times New Roman",Font.BOLD+Font.ITALIC,24);
		lbl.setFont(f1);

		lbl.setForeground(Color.red);

		lfnm=new Label("First Name");
		llnm=new Label("Last Name");
		tfnm=new TextField(20);
		tlnm=new TextField(10);

		bsave=new Button("Save");
		bexit=new JButton("Exit");
		
		pnl.add(lfnm);
		pnl.add(tfnm);
		pnl.add(llnm);
		pnl.add(tlnm);
		pnl.add(bsave);
		pnl.add(bexit);
	
		pnl.setLayout(null);
		lbl.setBounds(50,30,250,40);
		lfnm.setBounds(40,90,100,20);
		tfnm.setBounds(160,90,100,20);
	
		llnm.setBounds(40,130,100,20);
		tlnm.setBounds(160,130,100,20);
		
		bsave.setBounds(40,170,100,20);
		bexit.setBounds(160,170,100,20);
		
	}	
	public static void main(String args[])
	{
	Gui g=new Gui();
	}
}