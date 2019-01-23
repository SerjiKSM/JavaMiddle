/* 
 * Write class who can save array different type (int, long, ect.)
 * write method who return different any - like elements array on index
 */

package net.ukr.ksm;

public class Main {

	public static class Save<S> {
		private S[] value;

		public void setValue(S[] value) {
			this.value = value;
		}

		public S[] getValue() {
			return value;
		}

		public S getE(int x) {
			return value[x];
		}
	}
	
	public static void main(String[] args) {

		Save<String> s = new Save<String>();
		s.setValue(new String[] { "1111", "2222" });
		System.out.println(s.getE(0)); // 1111

	}

}

