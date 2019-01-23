package net.ukr.ksm;

public class Engine {
	
	private double mileage;
	private boolean started;
	private double engineVolume;	
	
	/**
	 * @param mileage
	 * @param engineVolume
	 * 
	 */
	public Engine(double mileage, double engineVolume) {
		super();
		this.mileage = mileage;
		this.engineVolume = engineVolume;
	}
	
	public static double getCons(double engineVolume){
		if(engineVolume == 2)
			return 10;
		else if (engineVolume == 3) 
			return 15;
		else if (engineVolume == 4.2)
			return 18;
		else 
			return 0;

	}
	
	
	/**
	 * @return the engineVolume
	 */
	public double getEngineVolume() {
		return engineVolume;
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
