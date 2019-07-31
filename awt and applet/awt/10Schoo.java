	JPanel p1;
	JLabel lblid,lblname,lblcity,lblphno;
	JTextField txtid,txtname,txtphno;
	JComboBox cmbcity;
	JButton btnsave ,btnretrive,btndelete,btnupdate,btnfirst,btnlast,btnnext,btnpre;
	lblid =new JLabel("Roll Number");
	lblname=new JLabel("Student name");
	lblcity=new JLabel("City");
	lblphno=new JLabel("Phone Number");
	
	txtid=new JTextField(10);
	txtname=new JTextField(10);
	txtphno=new JTextField(10);
	
	String s[]={"Mumbai","Pune","Nashik","Nagar"};
	cmbcity=new JComboBox(s);
	
	
	btnsave=new JButton("Save");
	btnretrive=new JButton("Retrive");
