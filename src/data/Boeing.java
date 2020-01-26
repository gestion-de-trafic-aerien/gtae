package data;


public class Boeing extends Plane {
	private int speed;
	private int fuel;
	private int fuelConsumption;
	public Boeing(Flight flight) {
		super(flight);	
		this.speed=900;
		this.fuel=1500;
		this.fuelConsumption=1;
	}

	
	@Override
	public double getSpeed() {
		return speed;
	}

	@Override
	public void setSpeed(int speed) {
		this.speed=speed;
	}

	@Override
	public int getFuel() {
		return fuel;
	}

	@Override
	public void setFuel() {
				this.fuel-=fuelConsumption;
	}

	@Override
	public int getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption=fuelConsumption;
	}

}
