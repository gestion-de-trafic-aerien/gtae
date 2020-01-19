package Motor;
import data.GlobaleData;
import data.Plane;
import java.util.Date;
import java.util.Timer;

import Motor.Controller;
public class Simulator implements Runnable  {
	

	
	private GlobaleData data;
	private Controller controller;
	public Simulator(GlobaleData data, Controller controller) {
		super();
		this.data = data;
		this.controller=controller;
	}
	
	@SuppressWarnings("deprecation")
	public void run() {
		Timer timer=new Timer();
		Chrono chrono = new Chrono(0, 0);
		timer.schedule(chrono, 1000, 1000);
		Date date;
		while(chrono.getHour()<24) {
			date=new Date(2020, 01, 21, chrono.getHour(), chrono.getMinute(),0);
			System.out.println(date);
			for(Plane plane : data.getWaitingPlanes()) {
				if(plane.getFlight().getDepartureDate().equals(date)) {
					new Thread(new SimulateFlight(plane, controller)).start();
					try {
						Thread.currentThread().join(0, 10);;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	




	
}
