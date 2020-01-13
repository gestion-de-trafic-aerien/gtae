/*
 * 
 */
package data;

import dataEnum.FlightStatus;
import dataEnum.PlaneID;

public class Plane {
	
	private  PlaneID planeID;
	private  double speed;
	private  FlightStatus statuts;
	private  int fuel;
	private  int fuelConsumption;
	private  Flight flight;
	public Plane(PlaneID planeID, double speed, FlightStatus statuts, int fuel, int fuelConsumption, Flight flight) {
		super();
		this.planeID = planeID;
		this.speed = speed;
		this.statuts = statuts;
		this.fuel = fuel;
		this.fuelConsumption = fuelConsumption;
		this.flight = flight;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public FlightStatus getStatuts() {
		return statuts;
	}
	public void setStatuts(FlightStatus statuts) {
		this.statuts = statuts;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public PlaneID getPlaneID() {
		return planeID;
	}
	public int getFuelConsumption() {
		return fuelConsumption;
	}
	
	@Override
	public String toString() {
		return "Plane [planeID=" + planeID + ", speed=" + speed + ", statuts=" + statuts + ", fuel=" + fuel
				+ ", fuelConsumption=" + fuelConsumption + ", flight=" + flight + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
