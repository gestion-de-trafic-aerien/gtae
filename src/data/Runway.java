/**
 * 
 */
package data;


import dataEnum.RunwayID;
import dataEnum.Status;

/**
 * @author nadir
 *
 */
public class Runway {
	
	private  RunwayID runwayID;
	private  Status status;
	
	public Runway(RunwayID runwayID, Status status) {
		super();
		this.runwayID = runwayID;
		this.status = status;
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
		return "Runway [runwayID=" + runwayID + ", status=" + status + "]";
	}
	
	
	
	
	
}
