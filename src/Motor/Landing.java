package Motor;

import java.util.Random;

import data.Airport;
import data.Plane;
import dataEnum.AirportID;
import dataEnum.FlightStatus;
import dataEnum.RunwayID;
import dataEnum.Status;
import gui.DashBoardPanel;
public class Landing {
	Plane plane;
	Airport desAirport;
	public Landing(Plane plane) {
		this.plane=plane;
		this.desAirport=plane.getFlight().getDestination();
	}


	public void run() {
		RunwayID runway;
		if(desAirport.getAirportID().equals(AirportID.ALGIERS)){
			DashBoardPanel.buttonNumber++;
			DashBoardPanel.number=DashBoardPanel.buttonNumber%5;
			runway= Main.dashboard.respondLanding(plane);
		}
		else {

			runway= Main.controller.respondLanding(plane);
		}
		if(plane.getStatuts().equals(FlightStatus.AUTHORIZED_TO_LAND)) {
			plane.getFlight().getSource().setStatusRunway(runway, Status.OCCUPIED);
			plane.setStatuts(FlightStatus.IS_LANDING);
			System.out.println("the flight "+plane.getFlight().getFlightID()+" process to landing on "+runway.name());
			try {
				Thread.sleep(3000);
				plane.setStatuts(FlightStatus.LANDED);
				System.out.println("the Flight "+plane.getFlight().getFlightID()+" landed successfuly");
				plane.getFlight().getDestination().setStatusRunway(runway, Status.FREE);
				plane.setPosition(null);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("the plane crushed while landing !!!");
			}
		}
		else {
			plane.setStatuts(FlightStatus.WAITING_FOR_LANDING);
			Random random = new Random();
			int retard;
			retard = random.nextInt(10)+3;
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
