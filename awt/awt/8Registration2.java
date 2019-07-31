import java.awt.*;
class Registration2
{
	Frame frm;
	Panel pnl;
	Label lfnm,llnm;
	TextField tfnm,tlnm;
	Button bsave,bexit;
	public Registration2()
	{
	frm=new Frame("Registration Form");
	frm.setSize(400,400);
	frm.setVisible(true);

	pnl=new Panel();
	frm.add(pnl);
	pnl.setBackground(Color.yellow);
	
	lfnm=new Label("First Name");
	tfnm=new TextField(10);

	llnm=new Label("Last Name");
	tlnm=new TextField(10);

	bsave=new Button("Save");
	bexit=new Button("Exit");
	
	pnl.add(lfnm);	
	pnl.add(tfnm);
	pnl.add(llnm);
	pnl.add(tlnm);
	pnl.add(bsave);
	pnl.add(bexit);
	pnl.setLayout(null);
	lfnm.setBounds(30,30,100,20);
	tfnm.setBounds(150,30,100,20);
	llnm.setBounds(30,70,100,20);
	tlnm.setBounds(150,70,100,20);

	}
	public static void main(String args[])
	{
	Registration2 r=new Registration2();
	}
}