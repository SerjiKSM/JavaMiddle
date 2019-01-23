package net.ukr.ksm;

import java.io.ObjectInputStream.GetField;

public class Main {

	public static void main(String[] args) {
		
		Developer teamLeaderdeveloper = new TeamLeaderDeveloper("Serhio", 500, 3); 
			
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Name: ")
					.append(teamLeaderdeveloper.getName())
					.append(" salary: ")
					.append(teamLeaderdeveloper.getBasicSalary())
					.append(" experience: ")
					.append(teamLeaderdeveloper.getExperience())
					.append(" salery %: ")
					.append(teamLeaderdeveloper.getSalery());
		
		System.out.println(stringBuilder.toString());	

	}

}
