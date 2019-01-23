package net.ukr.ksm;

public class Engine {
	
	private double mileage;
	private boolean started;
		
	/**
	 * @param mileage
	 */
	public Engine(double mileage) {
		super();
		this.mileage = mileage;
	}
	
	/**
	 * @return the mileage
	 */
	public double getMileage() {
		return mileage;
	}
	
	public void addMileage(double mileage) {
		if(started)
			this.mileage += mileage;
	}

	public boolean isStarted(){
		return started;
	}
	
	public void turnOn(){
		started = true;
	}
	
	public void turnOff(){
		started = false;
	}
	
}
