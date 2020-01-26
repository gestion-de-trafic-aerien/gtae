package data;

/*
 * Plane is represented by:
 * an ID that is generated randomly
 * a 2D position (x, y). A postion of a plane changes depending on the trajectory it takes
 * Status: 
 * 	EMERGENCY_LANDING: in case of lack of fuel
 *  IS_LANDING: in process of landing
 *  WAITING_FOR_LANDING: the plane waits for a free runway
 *  WAITING_FOR_TAKING_OFF: the plane waits for a permission to take off
 *  IS_TAKING_OFF: once the permission received, the plane takes off
 *  FLYING: in flight
 *  LANDED
 *  AUTHORIZED_TO_LAND: a plane is authorized to land only if there is a free runway, at least, in the destination airport
 *  AUTHORIZED_TO_TAKEOFF
}
 */

import java.util.Random;

import dataEnum.FlightStatus;

public abstract class Plane {
	
	private  int planeID;
	private  Position position;
	private  FlightStatus statuts;
	private  Flight flight;
	
	
	public Plane(Flight flight) {
		this.planeID = generatePlaneID();
		this.position = null;
		this.statuts = FlightStatus.WAITING_FOR_TAKING_OFF;
		this.flight = flight;
	}

	
	


	public abstract double getSpeed();
	public abstract void setSpeed(int speed);
	public abstract int getFuel();
	public abstract void setFuel();
	public abstract int getFuelConsumption();

	/*This method generates randomly plane IDs*/
	 public int generatePlaneID() {	 
		// TODO Auto-generated method stub
		Random random=new Random();
		return random.nextInt(10000);
	}
	public FlightStatus getStatuts() {
		return statuts;
	}
	public void setStatuts(FlightStatus statuts) {
		this.statuts = statuts;
	}
	
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public int getPlaneID() {
		return planeID;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}





	@Override
	public String toString() {
		return "planeID=" + planeID + ", statuts=" + statuts +" "+flight.toString()+"]\n";
	}


	





	

	
	
	
	
	
	
	
	
	
	
	
}
