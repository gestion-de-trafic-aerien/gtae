package dataEnum;


import data.Position;

public enum AirportID {
	PARIS(400,200),ALGIERS(400,400),WASHINGTON(50,50),BRAZILIA(50,550),MOSCOW(600,50),CANBERRA(600,550);
	
	private Position position;
	
	
	AirportID(int x,int y){
		position =new Position(x, y);
	}
	


	public Position getAirportPosition() {
		return position;
	}

	
	
	
	
	

}
