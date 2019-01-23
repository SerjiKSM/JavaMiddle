package net.ukr.ksm;

public class Climate {
	
	private boolean on;
	private int temperature;
	
	public Climate(){
		temperature = 20;
	}
	
	public void turnOn(){
		on = true;
	}
	
	public void turnOff(){
		on = false;
	}

	public boolean isOn(){
		return on;
	}

	/**
	 * @return the temperature
	 */
	public int getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	
	
}
