/**
 * 
 */
package data;

import java.util.Date;

/**
 * @author nadir
 *
 */
public class Flight {
	
	private Trajectory trajectory;
	private String flightID;
	private Date departureDate;
	private Date arrivalDate;
	
	/*
	 * Constructors
	 */
	
	public Flight() {}
	
	public Flight (Trajectory trajectory, String flightID, Date departureDate, Date arrivalDate) {
		this.trajectory = trajectory;
		this.flightID = flightID;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
	}
	
	public void setTrajectory (Trajectory trajectory) {
		this.trajectory = trajectory;
	}
	
	public void setFlightID (String flightID) {
		this.flightID = flightID;
	}
	
	public void setDepature (Date departureDate) {
		this.departureDate = departureDate;
	}
	
	public void setArrival (Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	
	public Trajectory getTrajectory () {
		return this.trajectory;
	}
	
	public String getFlightID () {
		return this.flightID;
	}
	
	public Date getDeparture () {
		return this.departureDate;
	}
	
	public Date getArrival () {
		return this.arrivalDate;
	}
	
}

