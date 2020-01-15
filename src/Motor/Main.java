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
import dataEnum.RunwayID;
import dataEnum.Status;

public class Main {

	public static void main(String[] args) {
		/*ArrayList<Runway> runways = new ArrayList<>();
		runways.add(new Runway(RunwayID.R1,Status.FREE));
		Airport alg = new Airport(AirportID.ALGIERS,runways);
		Airport paris = new Airport(AirportID.PARIS,runways);
		ArrayList<Airport> airports= new ArrayList<Airport>();
		ArrayList<Plane> waitingPlanes = new ArrayList<Plane>();
		@SuppressWarnings("deprecation")
		Date date = new Date(2020, 01, 14, 11, 30);
		Plane plane1 = new Plane(PlaneID.P00001,new Position(500, 400), 700, FlightStatus.WAITING_FOR_TAKING_OFF, 1000, 10, new Flight("001",date, alg, paris));
		Plane plane2 = new Plane(PlaneID.P00002,new Position(500, 700), 700, FlightStatus.WAITING_FOR_TAKING_OFF, 1000, 10, new Flight("002",date, paris, alg));

		waitingPlanes.add(plane1);
		waitingPlanes.add(plane2);*/
		Controller controller=new Controller();
		GlobaleData data= new GlobaleData();
		//System.out.println(data.getWaitingPlanes());
		Simulator simulator= new Simulator(data, controller);
		simulator.run();
		
		
	}

}
