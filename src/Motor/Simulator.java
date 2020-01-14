package Motor;
import data.Flight;
import data.GlobaleData;
import data.Plane;
import data.Trajectory;
import Motor.Controller;

public class Simulator implements Runnable  {
	

	
	private GlobaleData data;
	private Controller controller;
	
	public Simulator(GlobaleData data, Controller controller) {
		super();
		this.data = data;
		this.controller=controller;
	}
	
	
	
	public void requestTrajectory(Plane plane) {
		Flight flight = plane.getFlight();
		Trajectory initialTrajectory = flight.getTrajectory();
		Trajectory newTrajectory = controller.respondTrajectory(initialTrajectory);
		flight.setTrajectory(newTrajectory);		
	}



	@Override
	public void run() {
		Fly flying;
		Landing landing;
		TakeOFF takingOff;
		for(Plane plane : data.getWaitingPlanes()) {
			//Date currentDate = null;
			//if (plane.getFlight().getDepartureDate().equals(currentDate)) {
				takingOff=new TakeOFF(plane, controller);
				landing=new Landing(plane, controller);
				flying=new Fly(plane);
				takingOff.run();
				flying.run();
				landing.run();
			//}
		}
	}
	
	




	
}
