// Generics

package net.ukr.ksm;


public class Main {

	//private static final String "Hello" = null;

	public static void main(String[] args) throws Exception {

		TestArray testArray  = new TestArray();		
		String[] arrA = {"Hello", "Serhio"};
		testArray.swap(arrA , 0, 1);
		
		System.out.println("///////////--------------------//////////////////////");
		
		int[] arrB = {100, 200};
		testArray.swap(arrB, 0, 1);
		
		System.out.println("///////////-----GENERICS-----//////////////////////");
		
		String[] arrGenericsString = {"Hello", "Serhio"};
		testArray.<String> swap(arrGenericsString, 0, 1);

		System.out.println("///////////--------------------//////////////////////");

		int[] arrGenericsInteger = { 100, 200 };
		testArray.<Integer>swap(arrGenericsInteger, 0, 1);
		
	}

}

class TestArray {
	
	public static void swap(String[] a, int x, int y){
		System.out.println("a[x] = " + a[x] + ", a[y] = " + a[y]);		
		String t = a[x];
		a[x] = a[y];
		a[y] = t;
		System.out.println("a[x] = " + a[x] + ", a[y] = " + a[y]);
	}
	
	public static void swap(int[] a, int x, int y){
		System.out.println("a[x] = " + a[x] + ", a[y] = " + a[y]);		
		int t = a[x];
		a[x] = a[y];
		a[y] = t;
		System.out.println("a[x] = " + a[x] + ", a[y] = " + a[y]);
	}
	
	// Generics
	public static<T> void swap(T[] a, int x, int y){
		System.out.println("a[x] = " + a[x] + ", a[y] = " + a[y]);		
		T t = a[x];
		a[x] = a[y];
		a[y] = t;
		System.out.println("a[x] = " + a[x] + ", a[y] = " + a[y]);
	}
}

