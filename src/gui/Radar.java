package gui;

import java.awt.Color;import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


import Motor.Simulator;
import data.Airport;
import data.Plane;
import dataEnum.FlightStatus;

@SuppressWarnings("serial")
public class Radar extends JPanel implements Icon {
	public Radar() {
		super();	
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 =(Graphics2D)g;
		for(Airport airport : Simulator.data.getAirports()) {
			
			g.drawString(airport.getAirportID().name(), airport.getAirportPosition().getX(),airport.getAirportPosition().getY() );
			ImageIcon airportPic = new ImageIcon( getClass().getResource("/images/towerControl.png") );
			g.drawImage(airportPic.getImage(), airport.getAirportPosition().getX(), airport.getAirportPosition().getY(), null);
		}
		for(Plane plane : Simulator.data.getWaitingPlanes()){
			
			if(plane.getPosition()!=null) {
				ImageIcon planePic = new ImageIcon( getClass().getResource("/images/plane.png") );
				g2.drawImage(planePic.getImage(), plane.getPosition().getX(), plane.getPosition().getY(), null);
				g2.drawString(plane.getFlight().getFlightID(), plane.getPosition().getX(), plane.getPosition().getY());
				
				if(plane.getStatuts().equals(FlightStatus.FLYING)) {
					g2.setColor(Color.green);
					g2.fillOval(plane.getPosition().getX(),plane.getPosition().getY(), 10, 10);
				}
				if(plane.getStatuts().equals(FlightStatus.IS_TAKING_OFF)) {
					g2.setColor(Color.blue);
					g2.fillOval(plane.getPosition().getX(),plane.getPosition().getY(), 3, 3);
				}if(plane.getStatuts().equals(FlightStatus.IS_LANDING)) {
					g2.fillOval(plane.getPosition().getX(),plane.getPosition().getY(), 3, 3);
					g2.setColor(Color.ORANGE);
				}if(plane.getStatuts().equals(FlightStatus.EMERGENCY_LANDING)) {
					g2.fillOval(plane.getPosition().getX(),plane.getPosition().getY(), 3, 3);
					g2.setColor(Color.red);
				}

			}
		}
	}
	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void paintIcon(Component arg0, Graphics arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}
	

}
