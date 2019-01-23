package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car("Green", 1500, 1986);
		car.print();
		
		car.color  = "green";
		car.weight = 1500;
		car.year   = 1982;	
		car.print();
		
		car.beep();
		car.acceleration(30);
		car.print();
		
	}

}
