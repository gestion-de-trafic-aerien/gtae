package Motor;

import java.util.Random;

import data.Airport;
import data.Plane;
import dataEnum.FlightStatus;
import dataEnum.RunwayID;
import dataEnum.Status;

public class TakeOFF implements Runnable {
	Plane plane;
	Airport srcAirport;
	Controller controller;
	
	public TakeOFF(Plane plane, Controller controller) {
		this.plane=plane;
		this.srcAirport=plane.getFlight().getSource();
		this.controller=controller;
	}

	public void run() {
		RunwayID runway= controller.respondTakeOff(srcAirport);
		if(runway!=null) {
			plane.getFlight().getSource().setStatusRunway(runway, Status.OCCUPIED);
			plane.setStatuts(FlightStatus.IS_TAKING_OFF);
			System.out.println("the Flight "+plane.getFlight().getFlightID()+" process to taking-off"+runway.name());
			try {
				Thread.sleep(10000);
				plane.setStatuts(FlightStatus.FLYING);
				System.out.println("the Flight "+plane.getFlight().getFlightID()+" taked-off successfuly");
				plane.getFlight().getSource().setStatusRunway(runway, Status.FREE);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("the plane crushed while taking-off !!!");
			}
		}
		else {
			plane.setStatuts(FlightStatus.WAITING_FOR_TAKING_OFF);
			
			Random random = new Random();
			int retard;
			retard = random.nextInt(9);
			
			System.out.println("the flight "+plane.getFlight().getFlightID()+" taking off is delayed for "+retard+" minutes");
			
			try {
				
				Thread.sleep(10000*retard);
				Thread.currentThread().run();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
