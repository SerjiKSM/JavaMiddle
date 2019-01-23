package net.ukr.ksm;

public abstract class Developer {
	
	protected String name;
	protected double basicSalary;
	protected double experience;
	
	/**
	 * @param name
	 * @param basicSalary
	 * @param experience
	 */
	public Developer(String name, double basicSalary, double experience) {
		super();
		this.name = name;
		this.basicSalary = basicSalary;
		this.experience = experience;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the baseSalary
	 */
	public double getBasicSalary() {
		return basicSalary;
	}
	
	/**
	 * @return the experience
	 */
	public double getExperience() {
		return experience;
	}
	
	public abstract double getSalery();
	
}
