package tests;

import javax.swing.JFrame;

public class Animation extends JFrame {
	private JFrame frame;
	public  Animation() {
		frame=new JFrame();
		setCaracteristics();
	}
	private void setCaracteristics() {
		frame.setTitle("Gestion de trafic aerien");
		frame.setSize(1000, 1000);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
		frame.setVisible(true);
		    
	}
	

}
