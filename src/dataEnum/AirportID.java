package dataEnum;
import data.Position;

/*
 * An enumerated type class
 * It defines characteristics of an airport:
 * ID and position of the 6 airports
 */

public enum AirportID {
	PARIS(550,200),ALGIERS(550,350),WASHINGTON(50,50),BRAZILIA(50,400),MOSCOW(1000,50),CANBERRA(1000,400);
	
	private Position position;
	
	
	AirportID(int x,int y){
		position =new Position(x, y);
	}
	


	public Position getAirportPosition() {
		return position;
	}
	
	
	
	
	
	
	

}
