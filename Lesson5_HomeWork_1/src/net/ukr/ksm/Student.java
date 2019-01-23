package net.ukr.ksm;

import java.util.Date;

public class Student {

	private String name;
	private String surname;
	private Date birth;
	
	/**
	 * @param name
	 * @param surname
	 * @param birth
	 */
	public Student(String name, String surname, Date birth) {
		super();
		this.name = name;
		this.surname = surname;
		this.birth = birth;
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
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the birth
	 */
	public Date getBirth() {
		return birth;
	}
	/**
	 * @param birth the birth to set
	 */
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	
	
}
