package net.ukr.ksm;

import java.util.Random;

public class SeniorDeveloper extends Developer{
	
	public SeniorDeveloper(String name) {
		super(name);
		basicSalary = new Random().nextInt(2000) + 300;
		experience = new Random().nextInt(5) + 4;
		english = new Random().nextBoolean();
		age = new Random().nextInt(17) + 18;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return (basicSalary * 3) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
	}
	
	

}
