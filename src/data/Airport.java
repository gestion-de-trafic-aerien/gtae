/**
 * 
 */
package data;

import java.util.ArrayList;
import data.Runway;
import dataEnum.AirportID;
import dataEnum.RunwayID;
import dataEnum.Status;


public class Airport {

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
	public void setStatusRunway(RunwayID id, Status status) {
		for(Runway runway1 : runways) {
			if(runway1.getRunwayID().equals(id)){
				runway1.setStatus(status);
			}
		}
	}
	
	public String toString() {
		return airportID + ":" + runways;
	}

}
