package dataEnum;

public enum RunwayID {
	R1("ALGIERS"),R2("ALGIERS"),R3("ALGIERS"),
	R4("PARIS"),R5("PARIS"),R6("PARIS"),
	R7("CANEBERRA"),R8("CANEBERRA"),R9("CANEBERRA"),
	R10("MOSCOW"),R11("MOSCOW"),R12("MOSCOW"),
	R13("WASHINGTON"),R14("WASHINGTON"),R15("WASHINGTON"),
	R16("BRAZILIA"),R17("BRAZILIA"),R18("BRAZILIA");
	private String airport;
	private RunwayID(String airport) {
		this.airport=airport;
		// TODO Auto-generated constructor stub
	}
	public String getAirportName() {
		return airport;
	}
	
	

}
