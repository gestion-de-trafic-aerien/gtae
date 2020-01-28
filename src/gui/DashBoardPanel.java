package gui;

/*
 * This panel dedicated to the various graphic maneuvers 
 * for controlling and managing incidents that may occur during flight
 * These incidents are: lack of fuel, collisions
 */

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DashBoardPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DashBoardPanel () {
		JLabel title=new JLabel(" dashbord");
		title.setFont(new Font("Lucida Grande", Font.BOLD, 20));

		title.setBackground(Color.black);
		this.add(title);
		
		this.setBackground(Color.cyan);
		this.setLocation(0, 500);
		this.setSize(700, 200);
		this.setVisible(true);
	
	}
		

}

