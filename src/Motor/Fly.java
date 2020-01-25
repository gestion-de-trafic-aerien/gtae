package Motor;

import java.util.ArrayList;


import data.Plane;
import data.Position;
public class Fly {
	Plane plane;
	public Fly(Plane plane) {
		this.plane=plane;
	}
	
	public void run() {
		ArrayList<Position> trajectory=new ArrayList<>();
		trajectory=plane.getFlight().getTrajectory();
		if(trajectory!=null) {
			for (Position pos : trajectory) {
				plane.setPosition(pos);
				//System.out.println("flight "+plane.getFlight().getFlightID()+" "+plane.getStatuts()+" "+plane.getPosition().toString());
				try {
					Thread.sleep((long) (70000/plane.getSpeed()));
				} catch (InterruptedException e) {}
			}
		}		
	}
}
