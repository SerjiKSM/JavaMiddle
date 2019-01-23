package net.ukr.ksm;

import java.util.Random;

public class JuniorDeveloper extends Developer {

	public JuniorDeveloper(String name) {
		super(name);

		basicSalary = new Random().nextInt(500) + 300;
		experience = new Random().nextInt(2) + 0;
		english = new Random().nextBoolean();
		age = new Random().nextInt(8) + 18;
		
	}

	@Override
	public double getSalary() {
		
		return  basicSalary + (experience > 0 ? basicSalary * experience * 0.1 : 0);
	}

	
	
}
