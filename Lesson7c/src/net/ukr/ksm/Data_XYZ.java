package net.ukr.ksm;

public class Data_XYZ {

	double[] XYZ = new double[3];
	boolean setvalue = false;
	boolean endcalculate = false;

	synchronized void putdate(double[] a) {
		for (; setvalue;)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("ERROR!!!");
			}
		this.XYZ = a;
		System.out.println("Данные расчитаны");
		setvalue = true;
		notify();
	}

	synchronized double[] getdate() {
		for (; !setvalue;)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("ERROR!!!");
			}
		setvalue = false;
		notify();
		System.out.println("Данные сохранены в файл");
		return XYZ;
	}

}
