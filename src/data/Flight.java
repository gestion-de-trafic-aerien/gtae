/**
 * 
 */
package data;

import java.util.ArrayList;
import java.util.Date;

public class Flight {
	
	private String flightID;
	private Date departureDate;
	private Airport source;
	private Airport destination;
	
	/*
	 * Constructors
	 */
	public Flight( String flightID, Date departureDate, Airport source, Airport destination) {
		super();
		this.flightID = flightID;
		this.departureDate = departureDate;
		this.source = source;
		this.destination = destination;
	}

	public ArrayList <Position> getTrajectory() {
		Trajectory trajectory= new Trajectory(source, destination);
		return trajectory.calculTrajectory();
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate=departureDate;
	}

	public Airport getSource() {
		return source;
	}

	public void setSource(Airport source) {
		this.source = source;
	}

	public Airport getDestination() {
		return destination;
	}

	public void setDestination(Airport destination) {
		this.destination = destination;
	}

	public String getFlightID() {
		return flightID;
	}

	@Override
	public String toString() {
		return "Flight [flightID=" + flightID + ", departureDate=" + departureDate
				+ ", source=" + source + ", destination=" + destination + "]";
	}
	
	

	
}

