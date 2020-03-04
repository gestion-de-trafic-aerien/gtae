/**
 * 
 */
package data;

import java.util.ArrayList;
import data.Runway;
import dataEnum.AirportID;
import dataEnum.RunwayID;
import dataEnum.Status;

/*
 * This class defines the structure of an object Airport, 
 * which is represented by an ID, and an arraylist of runways.
 * Our main airport is: ALGIERS. This project is focused on managing 
 * our main airport and controlling graphically 5 other airports:
 * BRAZILIA, WASHINGTON, PARIS, MOSCOW, CANBERRA
 */


public class Airport {
	/*
	 * Constructor
	 */

	private  AirportID airportID;
	private  ArrayList  <Runway> runways;
		
	public Airport(AirportID airportID, ArrayList<Runway> runways) {
		super();
		this.airportID = airportID;
		this.runways = runways;
		
	}

	public Airport() {
		super();
	}

	public ArrayList<Runway> getRunways() {
		return runways;
	}

	public void setRunways(ArrayList<Runway> runways) {
		this.runways = runways;
	}

	public AirportID getAirportID() {
		return airportID;
	}
	public Position getAirportPosition() {
		return airportID.getAirportPosition();
	}
	

	
	/*
	 * freeRunway is a function that returns an object RunwayID: the ID of a free runway
	 * in a specified Airport
	 */
	public RunwayID freeRunway() {
		Status status=null;
		for(Runway runway1 : runways) {
			status= runway1.getStatus();
			if(status.equals(Status.FREE)){
				return runway1.getRunwayID();
			}
		}
		return null;
	}
	
	/*
	 * setStatusRunway is a void function that takes as parameters: a runway ID and the status of the airport
	 * The status of an airport has two values: FREE, OCCUPIED.
	 * An airport is free when it has, at least, one runway free. Occupied, otherwise.
	 */
	public void setStatusRunway(RunwayID id, Status status) {
		for(Runway runway1 : runways) {
			if(runway1.getRunwayID().equals(id)){
				runway1.setStatus(status);
			}
		}
	}
	public Status getStatusRunway(RunwayID id) {
		Status status = null;
		
		for(Runway runway1 : runways) {
			if(runway1.getRunwayID().equals(id)){
				status=runway1.getStatus();
			}
		}
		return status;
		
	}
	
	public String toString() {
		return airportID + ":" + runways;
	}

}
