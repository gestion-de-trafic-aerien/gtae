package Motor;

import data.Airport;
import data.Trajectory;
import dataEnum.RunwayID;
public class Controller {
	
	
	public Controller() {

	}
	
	public RunwayID respondTakeOff (Airport sourceAirport) {
		RunwayID id;
		id=sourceAirport.freeRunway();
		if(id!=null) {
			return id;
		}
		
		return null;
	}
	
	public RunwayID respondLanding (Airport destinationAirport) {
		RunwayID id;
		id=destinationAirport.freeRunway();
		if(id!=null) {
			return id;
		}
		return null;
	}
	public Trajectory respondTrajectory(Trajectory trajectory) {
		int altitude=trajectory.getAltitude();
		trajectory.setAltitude(altitude-400);
		return trajectory;
	}
	
	
	
	

}
