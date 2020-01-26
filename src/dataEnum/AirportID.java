package dataEnum;
import data.Position;

/*
 * An enumerated type class
 * It defines characteristics of an airport:
 * ID and position of the 6 airports
 */

public enum AirportID {
	PARIS(350,200),ALGIERS(350,350),WASHINGTON(50,50),BRAZILIA(50,450),MOSCOW(600,50),CANBERRA(600,450);
	
	private Position position;
	
	
	AirportID(int x,int y){
		position =new Position(x, y);
	}
	


	public Position getAirportPosition() {
		return position;
	}
	
	
	
	
	
	
	

}
