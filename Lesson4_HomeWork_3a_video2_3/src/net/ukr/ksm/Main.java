// Написать аналог Integer.parseInt()

package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		try {
			//String s = "-123y";
			String s = "1235555";
			System.out.println(ParsInt(s));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int ParsInt(String s) throws Exception {
		int sum = 0;
		boolean flag = true;
		int power = s.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(0) == 43 || s.charAt(0) == 45) && flag == true) {
				power--;
				flag = false;
				continue;
			}
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				sum += (s.charAt(i) - 48) * Math.pow(10, power);  
				power--;
			} else {
				throw new Exception("Wrong symbol №" + i + " in the String");
			}
		}
		if (s.charAt(0) == 45) {
			return sum * -1;
		}
		return sum;
	}

	class WrongSymbolException extends Exception {
		WrongSymbolException(String message) {
			super(message);
		}

		@Override
		public String getMessage() {
			return super.getMessage();
		}
	}

}
