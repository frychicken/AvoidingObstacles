import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.swing.*; 
class Dog_ extends JFrame implements ActionListener  { 
	boolean dark;
	public void asss(boolean darkmode) {
		dark = darkmode;
	}
	private static final long serialVersionUID = 1L;
	static JFrame frame;
	static JTextField textfield; 
	static JTextField txtTextBox1; static JTextField txtTextBox2; static JTextField txtTextBox3; static JTextField txtTextBox4;
	static JTextField txtTextBox5; static JTextField txtTextBox6;
	static JTextField textfield2;
	static JCheckBox checkBox;
	static JCheckBox checkBox2;
	static JCheckBox checkBox3;
	static JCheckBox checkBox4;
	static JCheckBox checkBox5;
	static int ff=0;
	static int fff=0;
	static int owen = 0;
	static int emaa = 0;
	static int outofideasfornames =0;
	Estima est = new Estima();
	static List<Integer> doggo = new LinkedList<Integer>();
	public void cat_() throws Exception{
		ff =0;
		doggo.clear();
		final URI uri = new URI("https://github.com/frychicken/art-IF-icial-Intelligence/blob/master/README.md");
		frame = new JFrame("Setup");

			Frychicken fry = new Frychicken();
		JButton button2 = new JButton();
		button2.setText("help");
		button2.setHorizontalAlignment(SwingConstants.LEFT);
		button2.setBorderPainted(false);
		button2.setOpaque(false);
		button2.setForeground(Color.BLUE);
		button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button2.setToolTipText("? - Display help");
		HashMap<TextAttribute, Object> textAttrMap = new HashMap<TextAttribute, Object>();
		textAttrMap.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		button2.setFont(button2.getFont().deriveFont(Font.BOLD | Font.ITALIC));
		button2.setFont(button2.getFont().deriveFont(textAttrMap));
		button2.setBackground(Color.lightGray);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Desktop.isDesktopSupported()) {
					Desktop desktop = Desktop.getDesktop();
					try {
						desktop.browse(uri);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		});
		textfield = new JTextField("10", 16);
		textfield2 = new JTextField("1", 12); 
		JLabel  label = new JLabel("Enter how many lab(s) you want (default: 10)"); 
		JLabel label2 = new JLabel("Enter how many obstacle(s) you want (default: 1, max:3)"); 
		JLabel lblLabel1 = new JLabel("Color Obstacles (default: green) ");
		JLabel lblLabel2 = new JLabel("Color Object (default: red) ");
		JLabel lbllbl1 = new JLabel("R");
		JLabel lbllbl2 = new JLabel("G");
		JLabel lbllbl3 = new JLabel("B");
		JLabel lbllbl4 = new JLabel("R");
		JLabel lbllbl5 = new JLabel("G");
		JLabel lbllbl6 = new JLabel("B");
		
		JLabel lbllbl7 = new JLabel("Debug mode");
		JLabel lbllbl8 = new JLabel("Sound");
		JLabel lbllbl9 = new JLabel("Auto-pilot");
		JLabel lbllbl10 = new JLabel("Game mode");
		JLabel lbllbl11 = new JLabel("Custom algorithm");

		txtTextBox1 = new JTextField("0");
		txtTextBox2 = new JTextField("255"); 
		txtTextBox3 = new JTextField("0");
		txtTextBox4 = new JTextField("255"); 
		txtTextBox5  = new JTextField("0");
		txtTextBox6 = new JTextField("0"); 
		JButton  button = new JButton("Okay"); 
		Dog_ loen = new Dog_(); 
		button.addActionListener(loen); 
		JPanel panel = new JPanel(); 
		checkBox = new JCheckBox();  	
		checkBox2 = new JCheckBox();  	
		checkBox3 = new JCheckBox();
		checkBox4 = new JCheckBox();
		checkBox5 = new JCheckBox();

		if (dark) {
			panel.setBackground(Color.DARK_GRAY);  
			panel.setOpaque(true);
			label.setForeground(Color.white);
			label2.setForeground(Color.white);
			lblLabel1.setForeground(Color.white);
			lblLabel2.setForeground(Color.white);
			lbllbl1.setForeground(Color.white);
			lbllbl2.setForeground(Color.white);
			lbllbl3.setForeground(Color.white);
			lbllbl4.setForeground(Color.white);
			lbllbl5.setForeground(Color.white);
			lbllbl6.setForeground(Color.white);
			
			lbllbl7.setForeground(Color.white);
			lbllbl8.setForeground(Color.white);
			lbllbl9.setForeground(Color.white);
			lbllbl10.setForeground(Color.white);
			lbllbl11.setForeground(Color.white);
	
		}
		panel.add(label);  
		panel.add(textfield); 
		panel.add(label2);
		panel.add(textfield2); 
		panel.add(checkBox);
		panel.add(checkBox2);
		panel.add(checkBox3);
		panel.add(checkBox4);
		panel.add(checkBox5);
		
		panel.add(button); 
		panel.add(button2);
		panel.add(lblLabel1);
		panel.add(lblLabel2);
		panel.add(lbllbl1);
		panel.add(lbllbl2);
		panel.add(lbllbl3);
		panel.add(lbllbl4);
		panel.add(lbllbl5);
		panel.add(lbllbl6); panel.add(lbllbl7); panel.add(lbllbl8); panel.add(lbllbl9);panel.add(lbllbl10);panel.add(lbllbl11);
		panel.add(txtTextBox1); panel.add(txtTextBox2); panel.add(txtTextBox3); panel.add(txtTextBox4); panel.add(txtTextBox5);
		panel.add(txtTextBox6);
		panel.setLayout(null);
		frame.add(panel);  
		
		label.setBounds(7, 1, 400,30);
		textfield.setBounds(330, 7, 170,30);
		label2.setBounds(7, 40, 500,30);
		textfield2.setBounds(410, 40, 100,30);
		
		checkBox.setBounds(250,130,20,19);
		checkBox2.setBounds(250,150,20,19);
		checkBox3.setBounds(250,170,20,19);
		checkBox4.setBounds(250,190,20,19);
		checkBox5.setBounds(250,210,20,19);

		
		lbllbl7.setBounds(280,130,120,19);
		lbllbl8.setBounds(280,150,120,19);
		lbllbl9.setBounds(280,170,120,19);
		lbllbl10.setBounds(280,190,120,19);
		lbllbl11.setBounds(280,210,120,19);

		button.setBounds(270,235,70,25);
		button2.setBounds(270, 255, 65, 25);
		
		lblLabel1.setBounds(7, 80, 250,20);
		lblLabel2.setBounds(7, 100, 200,20);
		
		lbllbl1.setBounds(250,80,50,15);
		lbllbl4.setBounds(250,110,50,15);
		lbllbl2.setBounds(350,80,50,15);
		lbllbl5.setBounds(350,110,50,15);
		lbllbl3.setBounds(450,80,50,15);
		lbllbl6.setBounds(450,110,50,15);
		
		txtTextBox1.setBounds(270, 70, 50, 30);
		txtTextBox2.setBounds(370, 70, 50, 30);
		txtTextBox3.setBounds(470, 70, 50, 30);
		txtTextBox4.setBounds(270, 100, 50, 30);
		txtTextBox5.setBounds(370, 100, 50, 30);
		txtTextBox6.setBounds(470, 100, 50, 30);
		

		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {
			   public void windowClosing(WindowEvent evt) {
			     System.out.println("Program terminated by user");
			     fry.writeLog("Program terminated by user");
			     est.getEst();
			     System.exit(0);
			   }
			  });
		frame.setSize(600, 350); 
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("lollol.png")));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);       
		synchronized (doggo) {
			while (doggo.isEmpty())
				try {
					doggo.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
		
			frame.setVisible(false);
			
		}
	}

	public void actionPerformed(ActionEvent e) { 	
		String s = e.getActionCommand(); 
		if(checkBox.isSelected()) {
			ff =1;
		}
		if(checkBox2.isSelected()) {
			fff =1;
		}
		if(checkBox3.isSelected()) {
			owen =1;
		}
		if(checkBox4.isSelected()) {
			emaa =1;
		}
		if(checkBox5.isSelected()) {
			outofideasfornames =1;
		}
		if (s.equals("Okay") ) { 
			synchronized (doggo) {
				try { 
					doggo.add(Integer.parseInt(textfield.getText()));
					doggo.add(Integer.parseInt(textfield2.getText()));
					doggo.add(Integer.parseInt(txtTextBox1.getText()));
					doggo.add(Integer.parseInt(txtTextBox2.getText()));
					doggo.add(Integer.parseInt(txtTextBox3.getText()));
					doggo.add(Integer.parseInt(txtTextBox4.getText()));
					doggo.add(Integer.parseInt(txtTextBox5.getText()));
					doggo.add(Integer.parseInt(txtTextBox6.getText()));
				} catch (Exception ee) {
					JOptionPane.showMessageDialog(frame, "Enter a number");
					doggo.add((Integer.parseInt(textfield.getText())));
					doggo.add((Integer.parseInt(textfield2.getText())));
					doggo.add(Integer.parseInt(txtTextBox1.getText()));
					doggo.add(Integer.parseInt(txtTextBox2.getText()));
					doggo.add(Integer.parseInt(txtTextBox3.getText()));
					doggo.add(Integer.parseInt(txtTextBox4.getText()));
					doggo.add(Integer.parseInt(txtTextBox5.getText()));
					doggo.add(Integer.parseInt(txtTextBox6.getText()));
				}
				doggo.notify();
			}
			frame.dispose();
		} 

	}
} 