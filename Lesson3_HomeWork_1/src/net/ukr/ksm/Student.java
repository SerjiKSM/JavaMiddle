package net.ukr.ksm;

public class Student extends Human {

	private String vuz;
	private int course;
	private String facult;
	private String specialty;

	public Student(String name, String middleName, String lastName, int age,
			boolean sex, String vuz, int course, String facult, String specialty) {
		super(name, middleName, lastName, age, sex);
		this.vuz = vuz;
		this.course = course;
		this.facult = facult;
		this.specialty = specialty;
	}

	/**
	 * @return the specialty
	 */
	public String getSpecialty() {
		return specialty;
	}

	/**
	 * @param specialty the specialty to set
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	/**
	 * @return the vuz
	 */
	public String getVuz() {
		return vuz;
	}

	/**
	 * @param vuz the vuz to set
	 */
	public void setVuz(String vuz) {
		this.vuz = vuz;
	}

	/**
	 * @return the course
	 */
	public int getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(int course) {
		this.course = course;
	}

	/**
	 * @return the facult
	 */
	public String getFacult() {
		return facult;
	}

	/**
	 * @param facult the facult to set
	 */
	public void setFacult(String facult) {
		this.facult = facult;
	}
	
	@Override
	public void info(){
		System.out.println("My name is " + getName());
		System.out.println("My surname is " + getMiddleName());
		System.out.println("My surname is " + getLastName());
		System.out.println("I'm " + getAge() + " years old.");
		System.out.println("Of course, I'm " + (isSex() ? "men.":"women."));
		System.out.println("I'm student of " + vuz + " on " + course + " course and in " + facult + " group.");
		System.out.println("My specialty is " + specialty + ".");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
	}

}
