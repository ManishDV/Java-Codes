import java.awt.*;
public class Registration
{
	Frame frm;
	Panel pnl;
	Label lfnm,llnm;
	TextField tfnm,tlnm;
	Button bsave,bexit;
	public Registration()
	{
frm=new Frame("Registartion Form");
frm.setVisible(true);
frm.setSize(400,400);
	
	pnl=new Panel();
	frm.add(pnl);
	pnl.setBackground(Color.yellow);
	
	lfnm=new Label("First Name");
	pnl.add(lfnm);

	tfnm=new TextField(10);
	pnl.add(tfnm);	

	llnm=new Label("Last Name");
	pnl.add(llnm);

	tlnm=new TextField(10);
	pnl.add(tlnm);	

	bsave=new Button("Save");
	bexit=new Button("Exit");

	pnl.add(bsave);
	pnl.add(bexit);
	}
	public static void main(String args[])
	{
Registration r=new Registration();	
	}	
}