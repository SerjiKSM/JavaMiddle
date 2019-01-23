package net.ukr.ksm;

import java.util.Random;


public class MidleDeveloper extends Developer {
	
	public MidleDeveloper(String name) {
		super(name);
		experience = new Random().nextInt(4) + 2;
		basicSalary = new Random().nextInt(500) + 300;
	}

	@Override
	public double getSalary() {
		return (basicSalary * 2) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
	}	

}
