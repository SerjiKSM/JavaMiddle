package net.ukr.ksm;

import java.io.*;

public class SaveDateToFile implements Runnable{

	PrintWriter prw;
	Data_XYZ a;
	
	SaveDateToFile(Data_XYZ a) {
		this.a = a;
		try {
			prw = new PrintWriter("date.txt");
		} catch (FileNotFoundException e) {
			System.out.println("ERROR SAVE TO FILE!!");
		}
		new Thread(this, "Saver").start();
	}

	@Override
	public void run() {

		double[] temp_XYZ = new double[3];
		for (; !a.endcalculate;) {
			temp_XYZ = a.getdate();
			prw.println(temp_XYZ[0] + "\t" + temp_XYZ[1] + "\t" + temp_XYZ[2]);
		}
		prw.close();
		
	}

	
	
}
