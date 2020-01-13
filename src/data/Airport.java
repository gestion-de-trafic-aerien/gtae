/**
 * 
 */
package data;

import java.util.ArrayList;
import data.Runway;
import dataEnum.AirportID;

/**
 * @author nadir
 *
 */
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

	@Override
	public String toString() {
		return "Airport [airportID=" + airportID + ", runways=" + runways + "]";
	}
	
	

}
