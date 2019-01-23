package net.ukr.ksm;

public class TeamLeaderDeveloper extends Developer {
	
	/**
	 * @param name
	 * @param baseSalary
	 * @param experience
	 */
	public TeamLeaderDeveloper(String name, double basicSalary, double experience) {
		super(name, basicSalary, experience);
	}

	@Override
	public double getSalery() {
		
		return (basicSalary * 4) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
	}

	
}
