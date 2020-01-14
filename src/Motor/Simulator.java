package Motor;
import java.util.ArrayList;
import java.util.List;


import data.Airport;
import data.Flight;
import data.GlobaleData;
import data.Plane;
import data.Position;
import data.Trajectory;
import dataEnum.FlightStatus;
import dataEnum.RunwayID;
import Motor.Controller;

public class Simulator implements Runnable  {
	

	
	private GlobaleData data;
	private List<Plane> waitingPlanes;
	private Controller controller;
	
	public Simulator(GlobaleData data, Controller controller) {
		super();
		this.data = data;
		this.controller=controller;
		waitingPlanes= new ArrayList<>();
	}
	
	public Boolean requestTakeOFF(Plane plane) {
		Airport sourceAirport= plane.getFlight().getSource();
		RunwayID runway= controller.respondTakeOff(sourceAirport);
		if(runway!=null) {
			plane.setStatuts(FlightStatus.NORMAL);
			System.out.println(plane.toString());
			return true;
		}
		else {
			waitingPlanes.add(plane);
			System.out.println("taking off delayed !!!");
			return false;
		}
	}
	
	public Boolean requestLanding(Plane plane) {
		Airport destinationAirport= plane.getFlight().getDestination();
		RunwayID runway= controller.respondLanding(destinationAirport);
		if(runway!=null) {
			plane.setStatuts(FlightStatus.NORMAL_LANDING);
			System.out.println(plane.toString());
			return true;
		}
		else {
			plane.setStatuts(FlightStatus.WAITING_FOR_LANDING);
			System.out.println("landing is delayed");
			return false;
		}
	}
	
	public void requestTrajectory(Plane plane) {
		Flight flight = plane.getFlight();
		Trajectory initialTrajectory = flight.getTrajectory();
		Trajectory newTrajectory = controller.respondTrajectory(initialTrajectory);
		flight.setTrajectory(newTrajectory);		
	}
	
	




	
}
