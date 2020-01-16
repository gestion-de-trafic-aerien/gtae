package data;


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
	public abstract void setFuel(int fuel);
	public abstract int getFuelConsumption();

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
