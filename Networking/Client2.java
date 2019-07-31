import java.net.*;
import java.io.*;

public class Client2 {
Socket s;
			PrintWriter pw;
			ServerSocket ss;
			
public void Client2 {
		// TODO Auto-generated method stub
			JLabel jbl11,jbl2;
		JLabel jbl1=new JLabel("CHATTING APP");
		JTextArea jt;
		JButton b;
		JPanel main,p1,p2,p3;
		BorderLayout bl;
		JFrame f;
		JScrollPane js;
		int hsb,vsb;
		public Client1(){
		f=new JFrame("Client 1");
		f.setVisible(true);
		f.setSize(800,800);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bl=new BorderLayout();
		main=new JPanel();
		f.setLayout(null);
		main.setBorder(BorderFactory.createLineBorder(Color.RED,2));
		main.setPreferredSize(new Dimension(700,700));
	
		main.setBounds(500,200,300,300);
		
		
		main.setLayout(bl);
		p1=new JPanel();
		p1.setPreferredSize(new Dimension(300,50));;
		jt=new JTextArea(2,18);
		b=new JButton("SEND");
		p1.setLayout(new FlowLayout());
		p1.add(jt,FlowLayout.LEFT);
		p1.add(b);
		
	
		vsb=JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED;
		hsb=JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		js=new JScrollPane(jt,vsb,hsb);
		p1.add(js);
		main.add(p1,BorderLayout.SOUTH);
		b.addActionListener(this);
		p2=new JPanel();
		p3=new JPanel();
		p3.add(jbl1,JLabel.CENTER);
		main.add(p3,BorderLayout.NORTH);
		main.add(p2,BorderLayout.CENTER);
		f.add(main);
		
		
		}
		@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		try {
		while(true)
		{
			while(soc.getInputStream()!=null)
			{
				ss=new ServerSocket(3333);
				soc=ss.accept();
				String str=jt.getText();
				pw=new PrintWriter(soc.getOutputStream());
				pw.println(str);
				
				pw.checkError();
				jbl11=new JLabel(str);
				p2.add(jbl1);
				
				BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String str1=br.readLine();
			jbl2=new JLabel(str1);
			p2.add(jbl2);
			
			}
			soc.close();
		}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1);
		} 
		
	}
				public static void main(String[] args)
				{
					new Client2();
				}

}
