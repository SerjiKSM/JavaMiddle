package net.ukr.ksm;

public class Main {
	public static void main(String[] args) {
		Developer[] list = {
				new JuniorDeveloper("Mike", 500, 0),
				new JuniorDeveloper("Dima", 500, 1),
				new JuniorDeveloper("Vova", 500, 2),
				new SeniorDeveloper("Jack", 500, 5),
				new TeamLeadDeveloper("Robby", 500, 7)
		};
		StringBuilder sb;
		
		for (Developer d : list) {
			sb = new StringBuilder() // !!!
				.append(d.getName())
				.append(": ")
				.append(d.getBasicSalary())
				.append(" -> ")
				.append(d.getSalary());
			
			System.out.println(sb.toString());
		}
		
		System.out.println("---------------------------------------------------------------");

		Developer juniorDeveloper = new JuniorDeveloper("Mike", 500, 2);
		
		if(juniorDeveloper instanceof JuniorDeveloper)     // Сравнение Объектов
			System.out.println("Junior");
		else if (juniorDeveloper instanceof SeniorDeveloper)
			System.out.println("Senor");
		
	}
}
