package net.ukr.ksm;

public class Rectangel extends Figure{
	
	private double heigh;
	private double width;
	
	public Rectangel(double h, double w) {
		heigh = h;
		width = w;
	}
	
	@Override
	public String getName () {
		return super.getName() + "Rectangel";
	}	
	
	@Override
	public double getSquare() {
		// TODO Auto-generated method stub
		return heigh * width;
	}


}
