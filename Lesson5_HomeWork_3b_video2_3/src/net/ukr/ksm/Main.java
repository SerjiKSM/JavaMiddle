// Добавить в проект Монитор функцию вывода даты создания файла на екран
// Добавить в проект ф-ю мониторинга больше одного файла
// Написать код для мониторнга каталога. Выводить на екран предупреждение если в каталог добавляется текстовый файл

package net.ukr.ksm;


public class Main {
	public static void main(String[] args) {
		
		String[] list = {
				 "d:\\1.txt",
				 "d:\\2.txt",
				 "d:\\3.txt"
				 };
		
		Monitor m = new Monitor(list, new FileEvent());
		m.start();	
		
	}
}