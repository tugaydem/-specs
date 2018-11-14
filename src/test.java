import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class test extends JFrame
{
	public JTextField txt_bestellung = new JTextField();

	public static void main(String agrs[])
	{
		new test();
	}
	public test()
	{
		Container cash_frm=getContentPane();
		cash_frm.setLayout(null);
		setSize(500,500);
		setVisible(true);
		
		txt_bestellung.setBounds(10,60,20,30);
		cash_frm.add(txt_bestellung);
		
	
		
		
	  
		
	}

}
