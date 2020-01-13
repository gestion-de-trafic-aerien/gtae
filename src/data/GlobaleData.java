package data;

import java.util.ArrayList;
import java.util.List;



public class GlobaleData {
	private List<Plane> waitingPlanes=new ArrayList<>();
	private List<Airport> airports = new ArrayList<>();
	
	public GlobaleData(List<Plane> waitingPlanes, List<Airport> airports) {
		super();
		this.waitingPlanes = waitingPlanes;
		this.airports = airports;
	}

	public List<Plane> getWaitingPlanes() {
		return waitingPlanes;
	}

	public List<Airport> getAirports() {
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
