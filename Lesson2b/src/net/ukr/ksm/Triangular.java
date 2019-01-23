package net.ukr.ksm;

public class Triangular extends Shape{
		
	double a;
	double b;
	double c;
	
	@Override
	double Perimeter() {   // Реализация абстрактных методов
		return a + b + c;
	}
	
	@Override
	double Square() { 
		double polP = (a + b + c) / 2;
		return Math.sqrt(polP * (polP - a) * (polP - b) * (polP - c));
	}
	

}
