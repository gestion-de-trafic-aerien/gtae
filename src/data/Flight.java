/**
 * 
 */
package data;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import dataEnum.AirportID;


public class Flight {
	
	private String flightID;
	private Date departureDate;
	private Airport source;
	private Airport destination;
	private Trajectory trajectory;
	
	/*
	 * Constructors
	 */
	public Flight(Date departureDate, Airport source, Airport destination) {
		super();
		this.flightID = generateFlightID();
		this.departureDate = departureDate;
		this.source = source;
		this.destination = destination;
		trajectory=new Trajectory(source.getAirportPosition(), destination.getAirportPosition());
	}

	public ArrayList <Position> getTrajectory() {
		return trajectory.getTrajectory();
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
	
	public String generateFlightID() {
		String flightID="";
		Random rand = new Random();
		String alphabet = "abcd123456789";
		int longueur = alphabet.length();
		for(int i = 0; i < 5; i++) {
		  int k = rand.nextInt(longueur);
		  flightID+=alphabet.charAt(k);
		}
		  return flightID;
		
	}

	
	public void setTrajectory(Trajectory trajectory) {
		this.trajectory = trajectory;
	}

	@Override
	public String toString() {
		return "Flight [flightID=" + flightID + ", departureDate=" + departureDate
				+ ", source=" + source + ", destination=" + destination + "]";
	}
	
	

	
}

