package data;

import java.awt.geom.Point2D;
import java.util.ArrayList;



public class Trajectory {
	
	private ArrayList<Point2D> points; 
	private int altitude;
	
	public Trajectory() {}
	
	public Trajectory (ArrayList<Point2D> points, int altitude ) {
		this.points = points;
		this.altitude = altitude;
	}
	
	public void setPoints (ArrayList<Point2D> points) {
		this.points = points;
	}

	public void setAltitude (int altitude) {
		this.altitude = altitude;
	}
	
	public ArrayList<Point2D> getPoints (){
		return this.points;
	}
	
	public int getAltitude() {
		return this.altitude;
	}
}

