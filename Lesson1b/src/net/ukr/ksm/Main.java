package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car("Green", 1500, 1986);
		car.acceleration(30);
		car = car.repaintCar(car, "Red", 1982);
		car.print();
		
	}

}
