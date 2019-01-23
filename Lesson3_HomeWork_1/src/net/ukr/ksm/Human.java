package net.ukr.ksm;

public class Human {
	private String name;
	private String middleName;
	private String lastName;
	private int age;
	private boolean sex;
	/**
	 * @param name
	 * @param middleName
	 * @param lastName
	 * @param age
	 * @param sex
	 */
	public Human(String name, String middleName, String lastName, int age, boolean sex) {
		super();
		this.name = name;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the sex
	 */
	public boolean isSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public void info(){
		System.out.print("My name is " + name);
		System.out.print("My surname is " + middleName);
		System.out.print("My surname is " + lastName);
		System.out.print(". I'm " + age + " years old.");
		System.out.println(" Of course, I'm " + (sex ? "men.":"women."));
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
	}

	/*
	@Override
	public int compareTo(Object second) {
		Human sname = (Human) second;
		return this.getSecond_name().compareTo(sname.getSecond_name());
	}
	*/
	
}
