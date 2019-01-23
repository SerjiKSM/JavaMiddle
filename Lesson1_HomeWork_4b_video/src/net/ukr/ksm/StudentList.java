package net.ukr.ksm;

public class StudentList {

	// private Student[]list = new Student[100];
	private Student[] list = new Student[1];
	private int p = 0;

	public void add(Student s) {
		
		if(p + 1 == list.length){
			Student[] student = new Student[list.length * 2];
			System.arraycopy(list, 0, student, 0, list.length);
			/*
			for (int i = 0; i < list.length; i++)
				student[i] = list[i];
			*/
			list = student;
			 
		}
					
		list[p++] = s;
	}

	public Student get(int n) {
		return list[n];
	}

	public int find(String name) {
		for (int i = 0; i < p; i++) {
			if (list[i].getName().equalsIgnoreCase(name))
				return i;
		}
		return -1;
	}

	public void delete(int n) {
		if (n < 0 || n >= list.length)
			return; // index out of bounds

		Student[] student = new Student[list.length - 1];
		/*
		 * // Пример 1 System.arraycopy(list, 0, student, 0, n);
		 * System.arraycopy(list, n + 1, student, n, student.length - n);
		 */

		// Пример 2
		int k = 0;

		for (int i = 0; i < n; i++)
			student[k++] = list[i];

		for (int i = n + 1; i < list.length; i++)
			student[k++] = list[i];

		list = student;

	}

}
