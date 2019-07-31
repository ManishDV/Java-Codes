import javax.swing.*; 
import java.awt.*;
public class BankSwing
{ 
static JFrame frame;  
static JPanel panel;   
JLabel lbankName, lname, lemailid, lsubject, lmessage, blabel;   
JTextField tname, temailid, tsubject;    
JTextArea tamessage;    
JButton submit, reset;
GridLayout g1;
public BankSwing()  
{
g1 = new GridLayout(2,2);
panel = new JPanel();  
frame = new JFrame("My Frame");
frame.getContentPane().add(panel);  
panel.setLayout(new GridLayout(6,2,20,20));	
lbankName = new JLabel("MoneySaver Corporation"); 
lbankName.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 25));  
blabel = new JLabel(" ");
lname =new JLabel("   Name");
lemailid =new JLabel("   E-Mail Id");
lsubject =new JLabel("   Subject");
lmessage =new JLabel("   Message");
tname = new JTextField(2); 
temailid = new JTextField(2);  
tsubject = new JTextField("Feedback",2); 
tamessage = new JTextArea("Type your text here", 3,20);
submit = new JButton("Submit");
reset = new JButton("Reset"); 
panel.add(lbankName);   
panel.add(blabel);
panel.add(lname);    
panel.add(tname);  
panel.add(lemailid);   
panel.add(temailid);   
panel.add(lsubject);  
panel.add(tsubject);
panel.add(lmessage); 
panel.add(tamessage);   
panel.add(submit);    
panel.add(reset);   
} 
public static void main(String args[])  
{
		BankSwing bs;
		bs=new BankSwing();
		frame.setSize(600,600);
		frame.setVisible(true);  
}  
}	
