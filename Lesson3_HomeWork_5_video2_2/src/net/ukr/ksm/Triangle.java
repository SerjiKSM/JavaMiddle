package net.ukr.ksm;

public class Triangle extends Figures {

	private double a;
	private double h;

	public Triangle(String name, double h, double a) {
		this.a = a;
		this.h = h;
		this.name = name;
	}

	public double getSideA() {
		return a;
	}

	public void setSideA(double a) {
		this.a = a;
	}

	public double getHeight() {
		return h;
	}

	public void setHeight(double h) {
		this.h = h;
	}

	@Override
	public double getSquare() {
		return (a * h) / 2;
	}

}
