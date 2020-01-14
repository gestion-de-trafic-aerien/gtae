package data;

import java.util.ArrayList;



public class GlobaleData {
	private ArrayList<Plane> waitingPlanes=new ArrayList<>();
	private ArrayList<Airport> airports = new ArrayList<>();
	
	public GlobaleData(ArrayList<Plane> waitingPlanes, ArrayList<Airport> airports) {
		super();
		this.waitingPlanes = waitingPlanes;
		this.airports = airports;
	}

	

	public ArrayList<Plane> getWaitingPlanes() {
		return waitingPlanes;
	}

	public ArrayList<Airport> getAirports() {
		return airports;
	}
	
	public void addAirport(Airport airport) {
		airports.add(airport);
	}
	public void AddWatingPlane(Plane plane) {
		// TODO Auto-generated method stub
		waitingPlanes.add(plane);
	}
	public void deleteWaitingPlane(Plane plane) {
		waitingPlanes.remove(plane);
	}
	

	@Override
	public String toString() {
		return "GlobaleData [waitingPlanes=" + waitingPlanes + ", airports=" + airports + "]";
	}
	
	
	
	
	

}
