package net.ukr.ksm;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Developer[] list = { new JuniorDeveloper("Mike"),
				new JuniorDeveloper("Felip"), new MidleDeveloper("Ivan"),
				new SeniorDeveloper("Jack"), new SeniorDeveloper("Jacki"),
				new SeniorDeveloper("Tomi"), new SeniorDeveloper("Toni"),
				new SeniorDeveloper("Anna"), new TeamLeadDeveloper("Robby") };

		JuniorDeveloper [] juniorDeveloper = new JuniorDeveloper[list.length];
		MidleDeveloper [] midleDeveloper = new MidleDeveloper[list.length];
		SeniorDeveloper [] seniorDeveloper = new SeniorDeveloper[list.length];
		TeamLeadDeveloper [] teamLeadDeveloper = new TeamLeadDeveloper[list.length];
		
		int j = 0;
		int m = 0;
		int s = 0;
		int t = 0;
		
		for (Developer elementArray : list) {
			if (elementArray instanceof JuniorDeveloper) {
				juniorDeveloper[j++] = (JuniorDeveloper) elementArray;
			} else if (elementArray instanceof MidleDeveloper){
				midleDeveloper[m++] = (MidleDeveloper) elementArray; 
			} else if (elementArray instanceof SeniorDeveloper){
				seniorDeveloper[s++] = (SeniorDeveloper) elementArray; 	
			} else if (elementArray instanceof TeamLeadDeveloper){
				teamLeadDeveloper[t++] = (TeamLeadDeveloper) elementArray;	
			}
		}
		
		juniorDeveloper = Arrays.copyOf(juniorDeveloper, j);
		midleDeveloper = Arrays.copyOf(midleDeveloper, m);
		seniorDeveloper = Arrays.copyOf(seniorDeveloper, s);
		teamLeadDeveloper = Arrays.copyOf(teamLeadDeveloper, t);		
		
		System.out.println("Junior Developer:");
		
		for (JuniorDeveloper elemJuniorDeveloper : juniorDeveloper) {
			System.out.println(" " + elemJuniorDeveloper.getName() + "; english: " + elemJuniorDeveloper.isEnglish()
								   + "; experience: " + elemJuniorDeveloper.getExperience() 
								   + "; age: " + elemJuniorDeveloper.getAge());
		}
		
		System.out.println("Midle Developer:");
		
		for (MidleDeveloper elemMidleDeveloper : midleDeveloper) {
			System.out.println(" " + elemMidleDeveloper.getName() + "; english: " + elemMidleDeveloper.isEnglish()
								   + "; experience: " + elemMidleDeveloper.getExperience() 
								   + "; age: " + elemMidleDeveloper.getAge());
		}
		
		System.out.println("Senior Developer:");
		
		for (SeniorDeveloper elemSeniorDeveloper : seniorDeveloper) {
			System.out.println(" " + elemSeniorDeveloper.getName() + "; english: " + elemSeniorDeveloper.isEnglish()
								   + "; experience: " + elemSeniorDeveloper.getExperience() 
								   + "; age: " + elemSeniorDeveloper.getAge());
		}
				
		System.out.println("Team Lead Developer:");

		for (TeamLeadDeveloper elemTeamLeadDeveloper : teamLeadDeveloper) {
			System.out.println(" " + elemTeamLeadDeveloper.getName() + "; english: " + elemTeamLeadDeveloper.isEnglish()
								   + "; experience: " + elemTeamLeadDeveloper.getExperience() 
								   + "; age: " + elemTeamLeadDeveloper.getAge());
		}
				
		
		System.out.println("Senior Developer with salary > 1500:");

		for (SeniorDeveloper elemSeniorDeveloper : seniorDeveloper) {
			if (elemSeniorDeveloper.getSalary() > 1500) {

				System.out.println("  " + elemSeniorDeveloper.getName() + " with salary "
						+ elemSeniorDeveloper.getSalary() + "$");
			}
		}
		
	}

}
