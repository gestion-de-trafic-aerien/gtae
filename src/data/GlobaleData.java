package data;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import dataEnum.AirportID;
import dataEnum.RunwayID;




public class GlobaleData {
	private ArrayList<Plane> waitingPlanes;
	private ArrayList<Airport> airports;

	public GlobaleData() {
		this.waitingPlanes = new ArrayList<>();
		this.airports=new ArrayList<>();
		GenerateAirports();
		GenerateFlights();
	}

	

	private void GenerateAirports() {
		ArrayList<Runway> runways=new ArrayList<>();
		runways.add(new Runway(RunwayID.R1));
		runways.add(new Runway(RunwayID.R2));
		runways.add(new Runway(RunwayID.R3));

		airports.add(new Airport(AirportID.ALGIERS, runways));
		airports.add(new Airport(AirportID.BRAZILIA, runways));
		airports.add(new Airport(AirportID.PARIS, runways));
		airports.add(new Airport(AirportID.MOSCOW, runways));
		airports.add(new Airport(AirportID.WASHINGTON, runways));
		airports.add(new Airport(AirportID.CANBERRA, runways));

		
		
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
	// generer des flight automatiquement

	public void GenerateFlights() {
		ArrayList<AirportID> airportIDs= new ArrayList<>();
		Airport source=null;
		Airport destination=null;
		Date date;

		for(int i=0;i<48;i++) {
			int heure=i/60;
			int min=i%60;
			date=new Date(2020, 01, 21, heure, min);
			for (int j = 0; j < 6; j++) {
				Random random = new Random();
				int rd1=random.nextInt(airports.size());
				int rd2=random.nextInt(airports.size());
				if(rd1!=rd2) {
					source= airports.get(rd2);
					destination= airports.get(rd1);
					Flight flight= new Flight(date, source, destination);
					waitingPlanes.add(new Airbus(flight));
				}
				
			}
			
			
		}
	}

	@Override
	public String toString() {
		return "GlobaleData [waitingPlanes=" + waitingPlanes + ", airports=" + airports + "]";
	}
	
	
	
	
	

}
