package net.ukr.ksm;

public abstract class Developer {

	protected String name;
	protected double basicSalary;
	protected int experience;
	protected boolean english;
	protected double age;

	/**
	 * @param name
	 */
	public Developer(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the basicSalary
	 */
	public double getBasicSalary() {
		return basicSalary;
	}

	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}

	/**
	 * @return the english
	 */
	public boolean isEnglish() {
		return english;
	}

	/**
	 * @return the age
	 */
	public double getAge() {
		return age;
	}

	public abstract double getSalary();

}
