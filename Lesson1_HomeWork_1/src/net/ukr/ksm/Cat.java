package net.ukr.ksm;

public class Cat {
		
	/**
	 * @param name
	 * @param color
	 * @param weight
	 * @param age
	 * @param sex
	 * @param length
	 * @param levelOfSatisfy
	 */
	public Cat(String name, String color, double weight, int age, char sex,
			double length, double  levelOfSatisfy) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.age = age;
		this.sex = sex;
		this.length = length;
		this.levelOfSatisfy = levelOfSatisfy;
	}

	/**
	 * @return the levelOfSatisfy
	 */
	public double getLevelOfSatisfy() {
		return levelOfSatisfy;
	}

	/**
	 * @param levelOfSatisfy the levelOfSatisfy to set
	 */
	public void setLevelOfSatisfy(double levelOfSatisfy) {
		this.levelOfSatisfy = levelOfSatisfy;
	}

	public String getName() {
		return name;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
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
	public char getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(char sex) {
		this.sex = sex;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name; 
	private String color;
	private double weight;
	private int    age;
	private char   sex;
	private double length;
	private double levelOfSatisfy;
	
	public void may(){
		System.out.println("May - May - May");
	}
	
	void print(){
		
		System.out.println("Name: " + name);
		System.out.println("Color: " + color);
		System.out.println("Weight: " + weight);
		System.out.println("Age cat: " + age);
		System.out.println("Sex: " + sex);
		System.out.println("Length: " + length);
		System.out.println("------------------//////////-------------------");
	
	}
	
	 //feed cat
    public void FeedCat(String kindOfFood, double weightOfFood){

        if (kindOfFood.compareToIgnoreCase("MILK") == 0) {
            weight += (double) 3/100*weightOfFood;
            levelOfSatisfy += 2.3;
        }
        else if (kindOfFood.compareToIgnoreCase("MEAT") == 0) {
            weight += (double) 15.3/100*weightOfFood;
            levelOfSatisfy += 5.1;
        }
        else weight += 0.01;

    }
	
	 public void printNew(){
	        System.out.println("I'm a cat....");
	        System.out.println("My name is: " + name);
	        System.out.println("My weight is: " + weight);
	  
	        if (levelOfSatisfy >= 30)
	            System.out.println("Life is beautiful!");
	        else if (levelOfSatisfy >= 10 && levelOfSatisfy < 30 )
	            System.out.println("I.m ok!");
	        else if (levelOfSatisfy >= 5 && levelOfSatisfy < 10 )
	            System.out.println("Life is crappy!");
	        else if (levelOfSatisfy >= 0 && levelOfSatisfy < 5 )
	            System.out.println("Hey you! Are you kidding me?");
	    
	    }
	
	
	
	

}
