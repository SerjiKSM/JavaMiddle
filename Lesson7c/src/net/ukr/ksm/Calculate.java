package net.ukr.ksm;

public class Calculate implements Runnable {

	Calculate(Data_XYZ a) {
		this.a = a;
		new Thread(this, "Calculate").start();
	}

	Data_XYZ a;

	@Override
	public void run() {

		double[] temp_XYZ = new double[3];
		for (double teta = 0; teta < Math.PI; teta = teta + 0.1) {
			for (double psi = 0; psi < Math.PI * 2; psi = psi + 0.2) {
				temp_XYZ[0] = Math.sin(teta) * Math.cos(psi);
				temp_XYZ[1] = Math.sin(teta) * Math.sin(psi);
				temp_XYZ[2] = Math.cos(teta);
				a.putdate(temp_XYZ);
			}
		}
		a.endcalculate = true;
	}

}
