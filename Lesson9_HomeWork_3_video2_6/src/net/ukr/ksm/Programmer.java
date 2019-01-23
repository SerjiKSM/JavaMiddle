package net.ukr.ksm;

import java.io.Serializable;

public class Programmer implements Cloneable, Serializable {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public Programmer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		int result = 12;
		return result * name.hashCode() * age * 25;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Programmer other = (Programmer) obj;
		if (age != other.age)
			return false;

		return true;
	}

	@Override
	protected Object clone() {
		try {
			Programmer clonProgrammer = (Programmer) super.clone();

			clonProgrammer.name = name;
			clonProgrammer.age = age;

			return clonProgrammer;

		} catch (CloneNotSupportedException e) {
			throw new InternalError();
		}
	}

}
