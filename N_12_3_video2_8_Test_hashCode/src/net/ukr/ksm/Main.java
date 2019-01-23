package net.ukr.ksm;

public class Main {

		
	public static void main(String[] args) {
				
	}

	// esli nyzno chtobu hashCode rabotal s raznumi tipami
	class Test {
		String s;
		int y;

		public int hashCode() {
			return y ^ s.hashCode();
		}
	}
	
	
}
