// Добавить в проект Монитор функцию вывода даты создания файла на екран
// Добавить в проект ф-ю мониторинга больше одного файла
// Написать код для мониторнга каталога. Выводить на екран предупреждение если в каталог добавляется текстовый файл

package net.ukr.ksm;


public class Main {
	public static void main(String[] args) {
		
		String[] ways = {
				// "d:\\1.txt",
				 //"d:\\2.txt",
				 "d:\\3.txt",
				 //"d:\\4.txt"
				 "d:\\TestJava"
				 };
		
		//Monitor m = new Monitor("d:\\1.txt", new FileEvent());
		
		for (String file : ways) {
			Monitor m = new Monitor(file, new FileEvent());
			m.start();	
		}
		
	}
}