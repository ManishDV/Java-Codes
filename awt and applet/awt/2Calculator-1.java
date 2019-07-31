//Calculator

//Importing packages.....
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Class Defination......
class Calculator extends JFrame implements ActionListener
{

//Instance Declaration......
    int FV,SV,Ans;
    JPanel p1,p2;
    JButton b[];
    static JTextField result;
    static String Command;

//Constructor..........
    public Calculator()
    {
    	//Defining Frame.......
    	super("Calculator");
    	setSize(220,220);
		setVisible(true);
		setLayout(new BorderLayout());
		
		//Panel 1......
		p1 = new JPanel();
		
		//Panel Controls......
		//1.TextField...Answer
		JTextField result = new JTextField();
		p1.add(result);
	
		//2.Buttons..
		JButton b[] = new JButton[16];
		//Numeric Buttons
		for(int i=0;i<10;i++)
		{
			b[i] = new JButton(String.valueOf(i));
			b[i].addActionListener(this);

		}

		//Operational buttons
		b[10] = new JButton(" + ");
		b[10].addActionListener(this);
		b[11]  = new JButton(" - ");
		b[11].addActionListener(this);
		b[12] = new JButton(" * ");
		b[12].addActionListener(this);
		b[13] = new JButton(" / ");
		b[13].addActionListener(this);
		b[14] = new JButton(" = ");
		b[14].addActionListener(this);
		b[15] = new JButton(" Off ");
		b[15].addActionListener(this);

		//Panel 2...Setting layout to get desired user friendly GUI.............
		p2 = new JPanel(new GridLayout(4,4,5,5));

		//First row : 7 8 9 /
		for(int i = 7;i<=9;i++)
		{
			p2.add(b[i]);
		}
		p2.add(b[13]);

		//Second row : 4 5 6 *
		for(int i = 4;i<=6;i++)
		{
			p2.add(b[i]);
		}	
		p2.add(b[12]);

		//Third row : 1 2 3 -
		for(int i = 1;i<=3;i++)
		{
			p2.add(b[i]);
		}
		p2.add(b[11]);

		//Fourth row : 0 Off = +
		p2.add(b[0]);
		p2.add(b[15]);
		p2.add(b[14]);
		p2.add(b[10]);
	
		//Adding layout to the frame............	
		this.add(p1, BorderLayout.NORTH);
        this.add(p2, BorderLayout.CENTER);
     }

//Method to assign values......
public static void assign(String no)
     {
     	
        if((result.getText()).equals(""))
        {
           result.setText(no);
        } 
        else
        {
           result.setText(result.getText()+no);
         }
     }

//Abstract method of interface ActionListener.............
 public void actionPerformed(ActionEvent e)
         {
            if(e.getSource()==b[0]) assign("0");
            else if(e.getSource()==b[1]) assign("1");
            else if(e.getSource()==b[2]) assign("2");
            else if(e.getSource()==b[3]) assign("3");
            else if(e.getSource()==b[4]) assign("4");
            else if(e.getSource()==b[5]) assign("5");
            else if(e.getSource()==b[6]) assign("6");
            else if(e.getSource()==b[7]) assign("7");
            else if(e.getSource()==b[8]) assign("8");
            else if(e.getSource()==b[9]) assign("9");

            // + Button click
            else if(e.getSource()==b[10])
              {
                 FV = Integer.parseInt(result.getText());
                 Command = "+";
                 result.setText("");
              }
         
       		// - Button click
       		else if(e.getSource()==b[11])
             {
                FV = Integer.parseInt(result.getText());
                Command="-";
                result.setText("");
             }

     		 // * Button click
        	else if(e.getSource()==b[12])
             {
                 FV = Integer.parseInt(result.getText());
                 Command = "*";
                 result.setText("");
              }

     		 // / Button click
      		else if(e.getSource()==b[13])
             {
                FV = Integer.parseInt(result.getText());
                Command = "/";
                result.setText("");
             }

       		// = Button click
      		else if(e.getSource()==b[14])
             {
               SV = Integer.parseInt(result.getText());
                if(Command.equals("/"))
				{
                    Ans=FV/SV;
				}
                else if(Command.equals("*"))
				{
                    Ans=FV*SV;
				}
                else if(Command.equals("-"))
				{
                    Ans=FV-SV;
				}
                else if(Command.equals("+"))
				{
                    Ans=FV+SV;
				}
                result.setText(" "+Ans);
                Command = "=";
             }
      }
     
//Main Method...............
    public static void main(String args[])
    {
    	Calculator c = new Calculator();
    }

}