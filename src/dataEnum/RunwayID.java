package dataEnum;

public enum RunwayID {
	R1("ALGIERS"),R2("ALGIERS"),R3("ALGIERS");
	private String airport;
	private RunwayID(String airport) {
		this.airport=airport;
		// TODO Auto-generated constructor stub
	}
	public String getAirport() {
		return airport;
	}
	
	

}
