package Motor;

import java.util.Date;
import data.Airport;
import data.Flight;
import data.GlobaleData;
import data.Plane;
import data.Trajectory;
import dataEnum.FlightStatus;
import dataEnum.RunwayID;
import Motor.Controller;

public class Simulator {
	
	private GlobaleData data;
	Controller controller;
	
	public Simulator(GlobaleData data, Controller controller) {
		super();
		this.data = data;
		this.controller=controller;
	}
	
	public void requestTakeOFF(Plane plane) {
		Airport sourceAirport= plane.getFlight().getSource();
		RunwayID runway= controller.respondTakeOff(sourceAirport);
		if(runway!=null) {
			plane.setStatuts(FlightStatus.NORMAL);
		}
		else {
			Date firstdate=plane.getFlight().getDepartureDate();
			Date newDate;
			newDate= calculNewDate(firstdate);
			plane.getFlight().setDepartureDate(newDate);
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
		String idFlight = flight.getFlightID();
		Trajectory initialTrajectory = flight.getTrajectory();
		Trajectory newTrajectory = controller.respondTrajectory(initialTrajectory);
		flight.setTrajectory(newTrajectory);		
	}

	private Date calculNewDate(Date date) {
		// to do fonction qui retourne une nouvelle date randomly
		return date;
	}

	
}
