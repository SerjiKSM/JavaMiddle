package net.ukr.ksm;

public class MyClass {
	public static void main(String[] args) {
		Data data = new Data();
		
		Processor pc = new Processor(data, "d:\\Test\\out.txt");
		pc.start();
		
		Preparator pr = new Preparator(data, "d:\\Test\\in.txt");
		pr.start();
	}
}
