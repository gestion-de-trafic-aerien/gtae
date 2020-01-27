package Motor;

import data.Airport;
import data.Plane;
import data.Trajectory;
import dataEnum.FlightStatus;
import dataEnum.RunwayID;
import dataEnum.Status;
public class Controller implements Runnable {
	
	private ControllerDataInterface data;
	public Controller(ControllerDataInterface data) {
		this.data=data;
	}
	
	public RunwayID respondTakeOff (Plane plane) {
		RunwayID id;
		id=plane.getFlight().getSource().freeRunway();
		if(id!=null) {
			plane.setStatuts(FlightStatus.AUTHORIZED_TO_TAKEOFF);
			plane.getFlight().getSource().setStatusRunway(id, Status.OCCUPIED);
			return id;
		}
		else {
			return null;

		}
	}
	
	public RunwayID respondLanding (Plane plane) {
		RunwayID id;
		id=plane.getFlight().getDestination().freeRunway();
		if(id!=null) {
			plane.setStatuts(FlightStatus.AUTHORIZED_TO_LAND);
			plane.getFlight().getDestination().setStatusRunway(id, Status.OCCUPIED);
			return id;
		}
		return null;
	}
	public Trajectory respondTrajectory(Trajectory trajectory) {
		int altitude=trajectory.getAltitude();
		trajectory.setAltitude(altitude-400);
		return trajectory;
	}

	public void emergencyLanding(Plane plane) {
		plane.setStatuts(FlightStatus.EMERGENCY_LANDING);
		Airport emergencyAirport=null;
		Double distance2=null, distance= 10000.0;
		for(Airport airport : data.getAirports()) {
			distance2= plane.getPosition().getDistance(airport.getAirportPosition());
			if(distance2<distance) {
				distance=distance2;
				emergencyAirport=airport;
			}
		}
		plane.getFlight().setDestination(emergencyAirport);
		System.out.println("emergency: "+emergencyAirport.getAirportID());
		plane.getFlight().setTrajectory(new Trajectory(plane.getPosition(),emergencyAirport.getAirportPosition()));
		
	}

	
	public void run() {
		//TODO: check the positions every second and prevent a collision
	}

	

	
	
	
	

}
