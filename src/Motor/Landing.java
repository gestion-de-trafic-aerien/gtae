package Motor;

import data.Airport;
import data.Plane;
import dataEnum.FlightStatus;
import dataEnum.RunwayID;

public class Landing implements Runnable {
	Plane plane;
	Airport desAirport;
	Controller controller;

	public Landing(Plane plane, Controller controller) {
		this.plane=plane;
		this.desAirport=plane.getFlight().getDestination();
		this.controller=controller;
	}
	
	
	public void run() {
		RunwayID runway= controller.respondLanding(desAirport);
		if(runway!=null) {
			plane.setStatuts(FlightStatus.IS_LANDING);
			System.out.println("the Flight "+plane.getFlight().toString()+"process to landing on "+runway.name());
			try {
				Thread.sleep(5000);
				plane.setStatuts(FlightStatus.LANDED);
				System.out.println("the Flight "+plane.getFlight().toString()+"landed successfuly");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("the plane crushed while landing !!!");
			}
		}
		else {
			plane.setStatuts(FlightStatus.WAITING_FOR_LANDING);
			System.out.println("landing is delayed");
		}
	}

}
