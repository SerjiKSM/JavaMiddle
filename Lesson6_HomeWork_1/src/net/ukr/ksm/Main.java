//1). Создайте сто потоков которые будут вычислять факториал 
//числа равного номеру этого потока и выводить результат на 
//экран.

package net.ukr.ksm;

public class Main {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			new Factorial(i);
		}

	}

}
