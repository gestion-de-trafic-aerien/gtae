package data;

/*
 * The database of the global informations which are used by the Simulator and the Controller
 */


import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import Motor.ControllerDataInterface;
import dataEnum.AirportID;
import dataEnum.RunwayID;


public class GlobaleData implements ControllerDataInterface {
	private ArrayList<Plane> waitingPlanes;
	private ArrayList<Airport> airports;

	public GlobaleData() {
		this.waitingPlanes = new ArrayList<>();
		this.airports=new ArrayList<>();
		GenerateAirports();
		GenerateFlights();
	}

	

	private void GenerateAirports() {
		ArrayList<Runway> runways1=new ArrayList<>();
		ArrayList<Runway> runways2=new ArrayList<>();
		ArrayList<Runway> runways3=new ArrayList<>();
		ArrayList<Runway> runways4=new ArrayList<>();
		ArrayList<Runway> runways5=new ArrayList<>();
		ArrayList<Runway> runways=new ArrayList<>();

		runways.add(new Runway(RunwayID.R1));
		runways.add(new Runway(RunwayID.R2));
		runways.add(new Runway(RunwayID.R3));
		runways1.add(new Runway(RunwayID.R4));
		runways1.add(new Runway(RunwayID.R5));
		runways1.add(new Runway(RunwayID.R6));
		runways2.add(new Runway(RunwayID.R7));
		runways2.add(new Runway(RunwayID.R8));
		runways2.add(new Runway(RunwayID.R9));
		runways3.add(new Runway(RunwayID.R10));
		runways3.add(new Runway(RunwayID.R11));
		runways3.add(new Runway(RunwayID.R12));
		runways4.add(new Runway(RunwayID.R13));
		runways4.add(new Runway(RunwayID.R14));
		runways4.add(new Runway(RunwayID.R15));
		runways5.add(new Runway(RunwayID.R16));
		runways5.add(new Runway(RunwayID.R17));
		runways5.add(new Runway(RunwayID.R18));

		airports.add(new Airport(AirportID.ALGIERS, runways));
		airports.add(new Airport(AirportID.BRAZILIA, runways5));
		airports.add(new Airport(AirportID.PARIS, runways1));
		airports.add(new Airport(AirportID.MOSCOW, runways3));
		airports.add(new Airport(AirportID.WASHINGTON, runways4));
		airports.add(new Airport(AirportID.CANBERRA, runways2));

		
		
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
		waitingPlanes.add(plane);
	}
	public void deleteWaitingPlane(Plane plane) {
		waitingPlanes.remove(plane);
	}
		
	/*
	 * This method below generates randomly flights during a whole day (24h)
	 * insured by a specific type of airplanes: Airbus.
	 */
	@SuppressWarnings("deprecation")
	public void GenerateFlights() {
		Airport source=null;
		Airport destination=null;
		Date date;
		for(int i=0;i<1440;i+=10) {
			int heure=i/60;
			int min=i%60;
			date=new Date(2020, 01, 21, heure, min,0);
			for (int j = 0; j <1; j++) {
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
