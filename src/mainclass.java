import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class mainclass 
{
	public static void main(String args[])
	
	{
		JFrame frm = new pizza_Automat();
		Dimension frame = new Dimension(571,537);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int top =(dim.height-frame.height)/2;
		int left =(dim.width-frame.width)/2;
		
		frm.setResizable(false);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frm.setVisible(true);
		frm.setSize(frame);
		frm.setLocation(left,top);
		frm.repaint();
		
	
	}

}
