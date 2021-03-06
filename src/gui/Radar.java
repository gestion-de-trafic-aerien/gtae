package gui;

/*
 * This class is an overview of the six airports that make up our environment
 * By this radar, we can check and see flights departing from different airports 
 * and arriving to different other airports
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Motor.ControllerDataInterface;
import data.Airport;
import data.Plane;
import dataEnum.FlightStatus;

@SuppressWarnings("serial")
public class Radar extends JPanel implements Runnable {
	private ControllerDataInterface data;

	public Radar(ControllerDataInterface data) {
		super();	
		this.data=data;
		this.setBackground(Color.black);
		this.setLocation(0, 0);
		this.setSize(1200, 470);
		this.setVisible(true);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 =(Graphics2D)g;
		for(Airport airport : data.getAirports()) {
			g2.setColor(Color.white);
			g2.drawString(airport.getAirportID().name(), airport.getAirportPosition().getX(),airport.getAirportPosition().getY() );
			ImageIcon airportPic = new ImageIcon( getClass().getResource("/images/towerControl.png") );
			g2.drawImage(airportPic.getImage(), airport.getAirportPosition().getX(), airport.getAirportPosition().getY(), null);
		}
		for(Plane plane : data.getWaitingPlanes()){
			
			if(plane.getPosition()!=null) {
				
				if(plane.getStatuts().equals(FlightStatus.FLYING)) {
					g2.setColor(Color.green);
				}
				if(plane.getStatuts().equals(FlightStatus.IS_TAKING_OFF)) {
					g2.setColor(Color.blue);
				}if(plane.getStatuts().equals(FlightStatus.IS_LANDING)) {
					g2.setColor(Color.ORANGE);
				}if(plane.getStatuts().equals(FlightStatus.EMERGENCY_LANDING)) {
					g2.setColor(Color.red);
				}
				if(plane.getStatuts().equals(FlightStatus.CHANGING_ALTITUDE)) {
					g2.setColor(Color.ORANGE);
				}
				g2.drawString(plane.getFlight().getFlightID(), plane.getPosition().getX(), plane.getPosition().getY());
				g2.fillOval(plane.getPosition().getX(),plane.getPosition().getY(), 10, 10);

			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	

}
