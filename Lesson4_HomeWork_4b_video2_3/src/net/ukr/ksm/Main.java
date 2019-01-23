// Написать Exception

package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		Anket n = new Anket();
		
		try {
			//n.setName("123");
			n.setName("ab");
		} catch (NameException e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	public static class Anket {
		private String name;
		
		public void setName(String name) throws NameException {
			for (int i = 0; i < name.length(); i++) {
				char q = (char) name.charAt(i);
				if(q < 97 || q > 122){
					throw new NameException("wrong");
				}
			}
		}

	}
	
	public static class NameException extends Exception {

		/**
		 * 
		 */
		public NameException(String message) {
			super(message);
		}

		@Override
		public String getMessage() {
			return "NameException " + super.getMessage();
		}

	}
	
	
}
