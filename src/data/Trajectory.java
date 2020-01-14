package data;

import java.util.ArrayList;

public class Trajectory {
	
	private ArrayList<Position> points; 
	private int altitude;
	private Airport source;
	private Airport destination;
	
	public Trajectory(Airport source, Airport destination) {
		this.source = source;
		this.destination = destination;
		points=new ArrayList<>();
		calculateTrajectory();
	}
		
	public ArrayList<Position> getTrajectory(){
		return points;
	}
	public void setPoints (ArrayList<Position> points) {
		this.points = points;
	}

	public void setAltitude (int altitude) {
		this.altitude = altitude;
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
	

	public void calculateTrajectory() {
		// TODO Auto-generated method stub
		Position point;
		int xA, xB, yA, yB;
		xA = this.source.getAirportID().getAirportPosition().getX();
		yA = this.source.getAirportID().getAirportPosition().getY();		
		xB = this.destination.getAirportID().getAirportPosition().getX();
		yB = this.destination.getAirportID().getAirportPosition().getY();
		
		if (xA > xB){
			for (int x=xA; x < xB; x-=10 ) {
				int y = (int) ((x* Math.abs(yB - yA)) / (Math.abs(xB - xA)));
				if (yB > yA) {
					point = new Position (x, yA+y);
				}
				else {
					point = new Position (x, yA-y);
				}
				this.points.add(point);
			}						
		}
		
		else if (xA<xB) {
			for (int x=xA; x < xB; x+=10 ) {
				int y = (int) ((x* Math.abs(yB - yA)) / (Math.abs(xB - xA)));
				if (yB > yA) {
					point = new Position (x, yA+y);
				}
				else {
					point = new Position (x, yA-y);
				}
				this.points.add(point);
			}
			
		}
		else if (xA==xB) {
			if(yA<yB) {
				for (int y=yA; y < yB; y+=10 ) {
					point = new Position (xA, y);
					this.points.add(point);


				}
						
			}
	
			
		}
		
	}
	
	
}

