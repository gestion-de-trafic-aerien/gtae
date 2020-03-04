package Motor;

import java.util.ArrayList;
import java.util.Random;

import data.Plane;
import data.Position;
import dataEnum.FlightStatus;
public class Fly {
	Plane plane;
	public Fly(Plane plane) {
		this.plane=plane;
	}
	
	public void run() {
		ArrayList<Position> trajectory=new ArrayList<>();
		trajectory=plane.getFlight().getTrajectoryList();
		Position pos;
		if(trajectory!=null) {
			for (int i=0;i<trajectory.size();i++) {
				pos=trajectory.get(i);
				if(pos.isOccupied()) {
					Random rand= new Random();
					int altitude= rand.nextInt(6000)+7000;
					plane.getFlight().getTrajectory().setAltitude(altitude);
					System.out.println("the flight "+plane.getFlight().getFlightID()+" changed it's altitude to "+altitude );
				}
				plane.setPosition(pos);
				plane.setFuel();
				if(plane.getFuel()<200 && !plane.getStatuts().equals(FlightStatus.EMERGENCY_LANDING)) {
					Main.controller.emergencyLanding(plane);
					System.out.println("emergency landing !!!");
					break;
				}
				try {
					Thread.sleep((long) (70000/plane.getSpeed()));
					pos.setOccupied(false);
				} catch (InterruptedException e) {}
			}
		}		
	}
}
