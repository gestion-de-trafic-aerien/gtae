package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import data.Plane;
public class FlightPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Plane> waitingPlanes;
	public FlightPanel (ArrayList<Plane> waitingPlanes) {
		this.waitingPlanes=waitingPlanes;
		setCaracteristics();
		
	}
		
	 
	public ArrayList<Plane> getWaitingPlanes() {
		return waitingPlanes;
	}


	public void setWaitingPlanes(ArrayList<Plane> waitingPlanes) {
		this.waitingPlanes = waitingPlanes;
	}


	public void paintComponent(Graphics g){
		for(Plane plane : waitingPlanes) {
			if(plane.getPosition()!=null){
				g.fillOval(plane.getPosition().getX(), plane.getPosition().getY(),10, 10);

			}

		}
	}    
	
	private void setCaracteristics() {
		this.setSize(800,600);
		this.setBackground(Color.black);
		this.setLocation(0, 0);
		this.setVisible(true);
	}

}
