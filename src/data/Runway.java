/**
 * 
 */
package data;

/**
 * @author nadir
 *
 */
public class Runway {
	
	private static RunwayID runwayID;
	private static Status status;
	
	/*
	 * Constructeur
	 */
	
	public void Runway() {}
	
	public void Runway (RunwayID runwayID, Status status) {
		this.runwayID = runwayID;
		this.status = status;
	}
	
	public void setRunwayID (RunwayID runwayID) {
		this.runwayID = runwayID;
	}
	
	public void setStatus (Status status) {
		this.status = status;
	}

	public RunwayID getRunwayID () {
		return this.runwayID;
	}
	
	public Status getStatus () {
		return this.status;
	}
}
