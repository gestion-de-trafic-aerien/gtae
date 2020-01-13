package dataEnum;

import java.awt.geom.Point2D;

public enum AirportID {
	PARIS(500,600),ALGIERS(500,400),WASHINGTON(50,1000),BRAZILIA(0,50),MOSCOW(900,900),CANBERRA(1000,0);
	
	private Point2D position;
	
	AirportID(int x, int y) {
		this.position.setLocation(x, y);
	}
	public Point2D getPosition() {
		return position;
		
	}
	
	
	
	
	

}
