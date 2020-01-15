package dataEnum;


import data.Position;

public enum AirportID {
	PARIS(500,700),ALGIERS(500,400),WASHINGTON(50,1000),BRAZILIA(0,100),MOSCOW(900,900),CANBERRA(1000,0);
	
	private Position position;
	
	
	AirportID(int x,int y){
		position =new Position(x, y);
	}
	


	public Position getAirportPosition() {
		return position;
	}

	
	
	
	
	

}
