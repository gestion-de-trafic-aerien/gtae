package Motor;

import data.Plane;
import dataEnum.FlightStatus;

public class SimulateFlight implements Runnable {
	private Plane plane;
	public SimulateFlight(Plane plane) {
		this.plane=plane;
	}

	
	public void run() {
		TakeOFF takingOFF = new TakeOFF(plane);
		Fly flying = new Fly(plane);
		Landing  landing = new Landing(plane);
		takingOFF.run();
		flying.run();
		if(plane.getStatuts().equals(FlightStatus.EMERGENCY_LANDING)) {
			flying.run();
		}
		landing.run();
		Thread.currentThread().interrupt();
			
		

	}

}
