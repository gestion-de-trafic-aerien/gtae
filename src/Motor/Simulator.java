package Motor;

import java.util.Date;

import data.Airport;
import data.GlobaleData;
import data.Plane;
import dataEnum.FlightStatus;
import dataEnum.RunwayID;

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

	private Date calculNewDate(Date date) {
		// to do fonction qui retourne une nouvelle date randomly
		return date;
	}

	
}
