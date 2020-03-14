package data;

/*Our environnement is a 2D one. The position of our items is represented by
 * X and Y: integers.
 */


public class Position {
	private int x;
	private int y;
	private boolean occupied;
	
	public Position(int x,int y) {
		occupied=false;
		this.x=x;
		this.y =y;
	}
	
	public boolean isOccupied() {
		return occupied;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}


	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
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
