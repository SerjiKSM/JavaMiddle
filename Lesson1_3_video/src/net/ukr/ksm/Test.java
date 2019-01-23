package net.ukr.ksm;

public class Test {

	private int a = 77;

	public class InnTest {
		public void job() {
			System.out.println(Test.this.a);
		}
	}
}
