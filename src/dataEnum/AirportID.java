package dataEnum;


import data.Position;

public enum AirportID {
	PARIS(400,400),ALGIERS(400,200),WASHINGTON(50,550),BRAZILIA(50,50),MOSCOW(750,550),CANBERRA(750,0);
	
	private Position position;
	
	
	AirportID(int x,int y){
		position =new Position(x, y);
	}
	


	public Position getAirportPosition() {
		return position;
	}

	
	
	
	
	

}
