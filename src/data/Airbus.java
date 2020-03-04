package data;

/*
 * A Class that defines the structure of a specific type of airplanes
 *
 */

public class Airbus extends Plane {
	private int speed;
	private int fuel;
	private int fuelConsumption;
	public Airbus( Flight flight) {
		super( flight);	
		this.speed=700;
		this.fuel=1200;
		this.fuelConsumption=1;
	}

	
	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		this.speed=speed;
	}

	@Override
	public int getFuel() {
		// TODO Auto-generated method stub
		return fuel;
	}

	@Override
	public void setFuel() {
		// TODO Auto-generated method stub
		this.fuel-=fuelConsumption;
	}

	@Override
	public int getFuelConsumption() {
		// TODO Auto-generated method stub
		return fuelConsumption;
	}
	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption=fuelConsumption;
	}

}
