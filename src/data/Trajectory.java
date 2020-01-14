package data;

import java.util.ArrayList;

public class Trajectory {
	
	private ArrayList<Position> points; 
	private int altitude;
	
	public Trajectory() {}
	
	public Trajectory (ArrayList<Position> points, int altitude ) {
		this.points = points;
		this.altitude = altitude;
	}
	
	public void setPoints (ArrayList<Position> points) {
		this.points = points;
	}

	public void setAltitude (int altitude) {
		this.altitude = altitude;
	}
	
	public ArrayList<Position> getPoints (){
		return this.points;
	}
	
	public int getAltitude() {
		return this.altitude;
	}
}

