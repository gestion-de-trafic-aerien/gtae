package Motor;

import java.util.ArrayList;


import data.Plane;
import data.Position;

public class Fly implements Runnable {
	Plane plane;
	
	public Fly(Plane plane) {
		this.plane=plane;
	}
	
	public void run() {
		ArrayList<Position> trajectory=new ArrayList<>();
		trajectory=plane.getFlight().getTrajectory();
		//System.out.println(trajectory);
		for (Position pos : trajectory) {
			plane.setPosition(pos);
			System.out.println(plane.toString());
			try {
				Thread.sleep((long) (3000-plane.getSpeed()));
			} catch (InterruptedException e) {
				System.out.println("plane has crushed!!");
			}
		}
	}

}
