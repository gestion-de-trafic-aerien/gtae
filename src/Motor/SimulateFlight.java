package Motor;


import java.lang.Thread.State;

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
		Thread takingOffThread= new Thread(takingOFF);
		Thread flyingThread= new Thread(flying);
		Thread landingThread= new Thread(landing);
	
		takingOffThread.start();
		if(takingOffThread.getState().equals(Thread.State.TERMINATED)) {
			flyingThread.start();
			if(flyingThread.getState().equals(Thread.State.TERMINATED)) {
				landingThread.start();

			}
		}
			
			
		

	}

}
