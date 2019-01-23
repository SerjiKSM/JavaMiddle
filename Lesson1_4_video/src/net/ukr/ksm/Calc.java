package net.ukr.ksm;

public class Calc {

	private double n;
	
	public void add(double x){
		n += x;
	}
	
	public void subtraction(double x){
		n -= x;
	}
	
	public void multiply(double x){
		n *= x;
	}
	
	public void division(double x){
		n /= x;
	}
	
	public void reset(){
		n = 0;
	}
	
	public double getValue(){
		return n;
	}
		
}
