package Motor;

import java.util.ArrayList;
import java.util.List;
import data.Airport;
import data.Flight;
import data.GlobaleData;
import data.Plane;
import data.Trajectory;
import dataEnum.FlightStatus;
import dataEnum.RunwayID;
import Motor.Controller;

public class Simulator implements Runnable {
	

	
	private GlobaleData data;
	private List<Plane> waitingPlanes;
	private Controller controller;
	
	public Simulator(GlobaleData data, Controller controller) {
		super();
		this.data = data;
		this.controller=controller;
		waitingPlanes= new ArrayList<>();
	}
	
	public void requestTakeOFF(Plane plane) {
		Airport sourceAirport= plane.getFlight().getSource();
		RunwayID runway= controller.respondTakeOff(sourceAirport);
		if(runway!=null) {
			plane.setStatuts(FlightStatus.NORMAL);
		}
		else {
			waitingPlanes.add(plane);
		}
	}
	
	public void requestLanding(Plane plane) {
		Airport destinationAirport= plane.getFlight().getDestination();
		RunwayID runway= controller.respondLanding(destinationAirport);
		if(runway!=null) {
			plane.setStatuts(FlightStatus.NORMAL_LANDING);
		}
		else {
			plane.setStatuts(FlightStatus.WAITING_FOR_LANDING);
		}
	}
	
	public void requestTrajectory(Plane plane) {
		Flight flight = plane.getFlight();
		Trajectory initialTrajectory = flight.getTrajectory();
		Trajectory newTrajectory = controller.respondTrajectory(initialTrajectory);
		flight.setTrajectory(newTrajectory);		
	}

	@Override
	public void run() {
		synchronized (this) {
			
		}
		
	}


	
}
