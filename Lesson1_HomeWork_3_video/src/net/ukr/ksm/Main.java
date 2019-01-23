package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {
		
		Car bmw = new Car("BMW");
		Car ferrari = new Car("Ferrari", 2000, 3.0);
		
		bmw.turnOn();
		ferrari.turnOn();
		
		final int[] speeds = new int[] {20, 60, 100};
		
		for (int s : speeds) {
			bmw.start(s, 0.5);
		}

		for (int s : speeds) {
			ferrari.start(s, 1);
		}

		bmw.turnOff();
		ferrari.turnOff();
		
		System.out.println(bmw.getName() + " drove : " + bmw.getMileage());
		System.out.println(ferrari.getName() + " drove : " + ferrari.getMileage());
		
		 System.out.println(bmw.getName() + " fuel consumption: " + bmw.getFuel());
         System.out.println(ferrari.getName() + " fuel consumption : " + ferrari.getFuel());
		
	}

}
