package Motor;
import java.util.ArrayList;
import java.util.Date;



import data.Airport;
import data.Flight;
import data.GlobaleData;
import data.Plane;
import data.Position;
import data.Runway;
import data.Trajectory;
import dataEnum.AirportID;
import dataEnum.FlightStatus;
import dataEnum.PlaneID;
import dataEnum.RunwayID;
import dataEnum.Status;

public class Main {

	public static void main(String[] args) {
		ArrayList<Runway> runways = new ArrayList<>();
		runways.add(new Runway(RunwayID.R1,Status.FREE));
		Airport alg = new Airport(AirportID.ALGIERS,runways);
		Airport paris = new Airport(AirportID.PARIS,runways);
		ArrayList<Airport> airports= new ArrayList<Airport>();
		ArrayList<Plane> waitingPlanes = new ArrayList<Plane>();
		@SuppressWarnings("deprecation")
		Date date = new Date(2020, 01, 14, 11, 30);
		Plane plane1 = new Plane(PlaneID.P00001,new Position(500, 400), 100, FlightStatus.WAITING_FOR_TAKING_OFF, 1000, 10, new Flight("001",date, alg, paris));
		waitingPlanes.add(plane1);
		Controller controller=new Controller();
		GlobaleData data= new GlobaleData(waitingPlanes, airports);
		Simulator simulator= new Simulator(data, controller);
		simulator.run();
		
		
	}

}
