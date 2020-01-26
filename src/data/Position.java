package data;

/*Our environnement is a 2D one. The position of our items is represented by
 * X and Y: integers.
 */


public class Position {
	private int x;
	private int y;

	public Position(int x,int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y =y;
	}

	
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}


	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	/*This method calculates the distance between 
	 * the position of the plane and the destination airport
	 */
	public Double getDistance(Position destinationPosition) {		
		double dx = (x - destinationPosition.getX());
		double dy = (y - destinationPosition.getY());
		double distance = Math.sqrt(dx*dx + dy*dy);
		return distance;
	}


	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + "]";
	}
	

	

}
