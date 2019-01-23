package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		Data_XYZ xyz = new Data_XYZ();
		new Calculate(xyz);
		new SaveDateToFile(xyz);

	}

}
