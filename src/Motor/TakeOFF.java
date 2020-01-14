package Motor;

import data.Airport;
import data.Plane;
import dataEnum.FlightStatus;
import dataEnum.RunwayID;

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
			plane.setStatuts(FlightStatus.IS_TAKING_OFF);
			System.out.println("the Flight "+plane.getFlight().toString()+"process to taking-off"+runway.name());
			try {
				Thread.sleep(5000);
				plane.setStatuts(FlightStatus.FLYING);
				System.out.println("the Flight "+plane.getFlight().toString()+"taked-off successfuly");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("the plane crushed while taking-off !!!");
			}
		}
		else {
			plane.setStatuts(FlightStatus.WAITING_FOR_LANDING);
			System.out.println("taking-off is delayed");
		}
	}

}
