package gui;

/*
 * This panel dedicated to the various graphic maneuvers 
 * for controlling and managing incidents that may occur during flight
 * These incidents are: lack of fuel, collisions
 */

import java.awt.Color;

import javax.swing.JPanel;

public class DashBoardPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DashBoardPanel () {
		this.setBackground(Color.BLUE);
		this.setLocation(0, 500);
		this.setSize(700, 200);
		this.setVisible(true);
	
	}
		

}

