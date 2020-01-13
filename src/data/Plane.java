/**
 * 
 */
package data;

/**
 * @author nadir
 *
 */
public class Plane {
	
	private static PlaneID planeID;
	private static double speed;
	private static FlightStatus statuts;
	private static int fuel;
	private static FlightID flightID;
	
	/*
	 * Empty constructor
	 */
	
	public void Plane () {}
	
	/*
	 * Constructor
	 */	
	
	public void Plane (PlaneID planeID, double speed, FlightStatus statuts, int fuel, FlightID flightID) {
		this.planeID = planeID;
		this.speed = speed;
		this.statuts = statuts;
		this.fuel = fuel;
		this.flightID = flightID
	}
	
	public void setPlaneID (PlaneID planeID) {
		this.planeID = planeID;
	}
	
	public void setSpeed (double speed) {
		this.speed = speed;
	}
	
	public void setStatuts (FlightStatus statuts) {
		this.statuts = statuts;
	}
	
	public void setFuel (int fuel) {
		this.fuel = fuel;
	}
	
	public void setFlightID (FlightID flightID) {
		this.flightID = flightID;
	}
	
	public PlaneID getPlaneID () {
		return this.planeID;
	}
	
	public double getSpeed () {
		return this.speed;
	}
	
	public FlightStatus getStatuts () {
		return this.statuts;
	}
	
	public int getFuel () {
		return this.fuel;
	}
	
	public FlightID getFLightID () {
		return this.flightID;
	}
}
