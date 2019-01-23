package net.ukr.ksm;

public class Car {

	private String name;
	private Engine engine;
	private Climate climate = new Climate();
	
	private double fuel;

	/**
	 * @param name
	 */
	public Car(String name) {
		super();
		this.name = name;
		engine = new Engine(0, 2.0);
	}

	public Car(String name, double milage, double engineVolume) {
		this.name = name;
		engine = new Engine(milage, engineVolume);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public double getMileage() {
		return engine.getMileage();
	}

	// Завести мотор
	public void turnOn() {
		engine.turnOn();
		climate.turnOn();
		climate.setTemperature(20);
	}

	// Заглушить мотор
	public void turnOff() {
		climate.turnOff();
		engine.turnOff();
	}

	// Установить скорость
	public void start(int speed, double hours) {
		if (engine.isStarted()) {
			// Пройденная дистанция
			double distance = hours * speed;
			engine.addMileage(distance);
			
			double f = (distance / 100) * Engine.getCons(engine.getEngineVolume());
			fuel += f;
		}
	}

	/**
	 * @return the fuel
	 */
	public double getFuel() {
		return fuel;
	}
}
