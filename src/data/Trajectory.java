package data;

import java.util.ArrayList;

public class Trajectory {
	
	private ArrayList<Position> points; 
	private int altitude;
	
	public Trajectory() {}
	
	public Trajectory (ArrayList<Position> points, int altitude ) {
		this.points = points;
		this.altitude = altitude;
	}
	
	public void setPoints (ArrayList<Position> points) {
		this.points = points;
	}

	public void setAltitude (int altitude) {
		this.altitude = altitude;
	}
	
	public ArrayList<Position> getPoints (){
		return this.points;
	}
	
	public int getAltitude() {
		return this.altitude;
	}
	
	public double distance(Flight flight){
		Position sourcePosition =  flight.getSource().getAirportID().getAirportPosition();
		Position destinationPosition = flight.getDestination().getAirportID().getAirportPosition();		
		double dx = (sourcePosition.getX() - destinationPosition.getX());
		double dy = (sourcePosition.getY() - destinationPosition.getY());
		double distance = Math.sqrt(dx*dx + dy*dy);
		System.out.println("The distance of the flight ID:" + flight.getFlightID() + "is" + distance + "Km");
		return distance;
		
	}
	
	public double flownOverDistance (Plane plane, Flight flight) {
		Position initialPosition = flight.getSource().getAirportID().getAirportPosition();
		Position checkpoint = plane.getPosition();		
		double dx = (initialPosition.getX() - checkpoint.getX());
		double dy = (initialPosition.getY() - checkpoint.getY());
		double flownOverDistance = Math.sqrt(dx*dx + dy*dy);
		System.out.println("The distance of the flight ID:" + flight.getFlightID() + "is" + flownOverDistance + "Km");
		return flownOverDistance;
		
	}
	
	public double leftDistance (Flight flight, double distance, double flownOverDistance) {
		double leftDistance = distance - flownOverDistance;
		System.out.println("The left distance of the flight ID:" + flight.getFlightID() + "is" + leftDistance + "Km");
		return leftDistance;
		
	}
	
	
}

