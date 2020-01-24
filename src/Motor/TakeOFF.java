package Motor;

import java.util.Random;

import data.Airport;
import data.Plane;
import dataEnum.FlightStatus;
import dataEnum.RunwayID;
import dataEnum.Status;

public class TakeOFF {
	Plane plane;
	Airport srcAirport;
	
	public TakeOFF(Plane plane) {
		this.plane=plane;
		this.srcAirport=plane.getFlight().getSource();
	}

	public void run() {
		RunwayID runway= Main.controller.respondTakeOff(srcAirport);
		if(runway!=null) {
			plane.getFlight().getSource().setStatusRunway(runway, Status.OCCUPIED);
			plane.setStatuts(FlightStatus.IS_TAKING_OFF);
			//System.out.println(plane.getFlight().getSource().getRunways().toString());
			System.out.println("the Flight "+plane.getFlight().getFlightID()+" process to taking-off"+runway.name());
			try {
				Thread.sleep(3000);
				System.out.println("the Flight "+plane.getFlight().getFlightID()+" taked-off successfuly");
				plane.setStatuts(FlightStatus.FLYING);
				plane.getFlight().getSource().setStatusRunway(runway, Status.FREE);
				//System.out.println(plane.getFlight().getSource().getRunways().toString());

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("the plane crushed while taking-off !!!");
			}
		}
		else {
			plane.setStatuts(FlightStatus.WAITING_FOR_TAKING_OFF);
			
			Random random = new Random();
			int retard;
			retard = random.nextInt(10)+3;
			
			System.out.println("the flight "+plane.getFlight().getFlightID()+" taking off is delayed for "+retard+" minutes");
			
			try {
				
				Thread.sleep(1000*retard);
				this.run();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
