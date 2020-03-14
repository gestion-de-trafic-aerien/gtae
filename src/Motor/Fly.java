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
		Position[] after;
		if(trajectory!=null) {
			for (int i=0;i<trajectory.size();i++) {
				pos=trajectory.get(i);
				after= new Position[30];
				boolean occupiedArround=false;
				try{
					for(int j=0;j<30;j++) {
						after[j]= trajectory.get(i+j);
						if(after[j].isOccupied()) {
							occupiedArround=true;
						}
					}
					if(!occupiedArround) {
						plane.setStatuts(FlightStatus.FLYING);
						
					}
				}catch(IndexOutOfBoundsException e) {
				}
				if(occupiedArround && plane.getStatuts().equals(FlightStatus.FLYING)) {
					Random rand= new Random();
					int altitude= rand.nextInt(6000)+7000;
					plane.getFlight().getTrajectory().setAltitude(altitude);
					System.out.println("the flight "+plane.getFlight().getFlightID()+" changed it's altitude to "+altitude );
					plane.setStatuts(FlightStatus.CHANGING_ALTITUDE);
				}
				
				
				pos.setOccupied(true);
				plane.setPosition(pos);
				plane.setFuel();
				if(plane.getFuel()<200 && !plane.getStatuts().equals(FlightStatus.EMERGENCY_LANDING)) {
					Main.controller.emergencyLanding(plane);
					System.out.println("emergency landing !!!");
					break;
				}
				try {
					Thread.sleep((long) (90000/plane.getSpeed()));
					pos.setOccupied(false);
				} catch (InterruptedException e) {}
			}
		}		
	}
}
