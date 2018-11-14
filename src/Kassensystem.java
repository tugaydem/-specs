import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Kassensystem extends JFrame
{
	public JTextArea txt_bestellung = new JTextArea();
	public JButton  kartenzahlung = new JButton();
	public JButton  barzahlung = new JButton();
	public JButton  storno = new JButton();
	public static void main(String args[])
	{
		new Kassensystem();
	}
	public Kassensystem()
	{
		JFrame cash_frm = new JFrame();
		Dimension frame2 = new Dimension(671,484);
		Dimension dim2 = Toolkit.getDefaultToolkit().getScreenSize();
		int top2 =(dim2.height-frame2.height)/2;
		int left2 =(dim2.width-frame2.width)/2;
		
		setTitle("Kassensystem Pizza4YOU");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setSize(frame2);
		setLocation(left2,top2);
		
		
		Container contain = getContentPane();  //in Frame Bauelemente inkludieren
		contain.setLayout(null);
		
		setVisible(true);
		contain.setBackground(new Color(137,207,240));
		
		txt_bestellung.setBounds(303,0,360,260);
		txt_bestellung.setBackground(new Color(51-153-255));
		contain.add(txt_bestellung);
		
		storno.setText("Storno");
		storno.setForeground(Color.RED);
		storno.setBounds(580,270,75,40);
		storno.setBackground(Color.DARK_GRAY);
		contain.add(storno);
		
		barzahlung.setText("BAR");
		barzahlung.setForeground(Color.YELLOW);
		barzahlung.setBounds(580,340,75,40);
		barzahlung.setBackground(Color.DARK_GRAY);
		contain.add(barzahlung);
	    
		kartenzahlung.setText("Karte");
		kartenzahlung.setForeground(Color.white);
		kartenzahlung.setBounds(580,410,75,40);
		kartenzahlung.setBackground(Color.DARK_GRAY);
		contain.add(kartenzahlung);
		
	
		
	
		
	  
		
	}

}
