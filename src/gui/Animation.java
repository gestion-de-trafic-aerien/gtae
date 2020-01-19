package gui;

import javax.swing.JFrame;

public class Animation extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public  Animation() {
		setCaracteristics();
	}
	private void setCaracteristics() {
		
		this.setTitle("Gestion de trafic aerien");
		this.setSize(1200, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
		this.setVisible(true);
		
		
		    
	}
	

}
