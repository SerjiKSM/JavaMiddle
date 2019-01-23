package net.ukr.ksm;

import java.util.Random;

public class TeamLeadDeveloper extends Developer {

	public TeamLeadDeveloper(String name) {
		super(name);

		basicSalary = new Random().nextInt(2000) + 1500;
		experience = new Random().nextInt(7) + 5;
		english = new Random().nextBoolean();
		age = new Random().nextInt(17) + 25;
	}

	@Override
	public double getSalary() {
		return (basicSalary * 4) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
	}

}
