/**
 * 
 */
package data;

/*
 * Flight is a class in which are contained informations relative to a flight.
 * ID
 * Date of departure in this format: Date(int year, int month, int date, int hrs, int min, int sec)
 * Departure airport
 * Destination airport
 * Trajectory: a list of 2D points generated randomly.
 * 
 */

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
	
	/*
	 * generateFlighID is a String method that generates random IDs for different flights
	 * during the simulation
	 */
	
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

