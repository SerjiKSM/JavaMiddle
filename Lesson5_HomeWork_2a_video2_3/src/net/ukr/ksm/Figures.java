package net.ukr.ksm;

public abstract class Figures implements Comparable {
	
	protected String name;
	
	public abstract double getSquare();
	
	public String getName(){
		return name;
	}
	
}
