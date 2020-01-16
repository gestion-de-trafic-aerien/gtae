package Motor;
import data.GlobaleData;
import data.Plane;
import Motor.Controller;
public class Simulator implements Runnable  {
	

	
	private GlobaleData data;
	private Controller controller;
	public Simulator(GlobaleData data, Controller controller) {
		super();
		this.data = data;
		this.controller=controller;
	}
	
	public void run() {
		for(Plane plane : data.getWaitingPlanes()) {
			new Thread(new SimulateFlight(plane, controller)).start();	
		}
	}
	
	




	
}
