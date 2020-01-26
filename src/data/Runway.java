/**
 * 
 */
package data;

/*Every airport we have in our environnement, has 3 runways
 * Take-offs and landings are determined depending on the status of the runways
 * of the destination airport
 * A runway has two status: FREE, OCCUPIED
 */


import dataEnum.RunwayID;
import dataEnum.Status;


public class Runway {
	
	private  RunwayID runwayID;
	private  Status status;
	
	public Runway(RunwayID runwayID) {
		super();
		this.runwayID = runwayID;
		this.status = Status.FREE;
	}
	
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public RunwayID getRunwayID() {
		return runwayID;
	}


	@Override
	public String toString() {
		return runwayID + ": " + status ;
	}
	
	
	
	
	
}
