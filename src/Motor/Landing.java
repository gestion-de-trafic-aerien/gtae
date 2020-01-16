package Motor;

import java.util.Random;

import data.Airport;
import data.Plane;
import dataEnum.AirportID;
import dataEnum.FlightStatus;
import dataEnum.RunwayID;
import dataEnum.Status;

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
			plane.getFlight().getDestination().setStatusRunway(runway, Status.OCCUPIED);
			plane.setStatuts(FlightStatus.IS_LANDING);
			System.out.println("the flight "+plane.getFlight().getFlightID()+" process to landing on "+runway.name());
			try {
				Thread.sleep(3000);
				plane.setStatuts(FlightStatus.LANDED);
				System.out.println("the Flight "+plane.getFlight().getFlightID()+" landed successfuly");
				plane.getFlight().getDestination().setStatusRunway(runway, Status.FREE);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("the plane crushed while landing !!!");
			}
		}
		else {
			plane.setStatuts(FlightStatus.WAITING_FOR_LANDING);
			Random random = new Random();
			int retard;
			retard = random.nextInt(30);
			System.out.println("landing is delayed for "+retard+" minutes");
			
			try {
				
				Thread.sleep(1000*retard);
				run();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
