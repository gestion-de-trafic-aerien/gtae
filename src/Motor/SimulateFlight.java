package Motor;

import data.Plane;

public class SimulateFlight implements Runnable {
	private Plane plane;
	Controller controller;
	public SimulateFlight(Plane plane,Controller controller) {
		this.plane=plane;
		this.controller= controller;
	}

	
	public void run() {
		TakeOFF takingOFF = new TakeOFF(plane, controller);
		Fly flying = new Fly(plane);
		Landing  landing = new Landing(plane, controller);
		takingOFF.run();
		flying.run();
		landing.run();		
	}

}
