package net.ukr.ksm;
			
/**
 * @author Serhio
 * Создание классов внутри класса
 */
public class A {

	public class A1 {
		public void job() {
			System.out.println("A1.job");
		}
	}

	public static class A2 {
		public void job() {
			System.out.println("A2.job");
		}
	}

}
