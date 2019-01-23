package net.ukr.ksm;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Developer[] list = { new JuniorDeveloper("Mike"),
				new JuniorDeveloper("Felip"), new MidleDeveloper("Ivan"),
				new SeniorDeveloper("Jack"), new SeniorDeveloper("Jacki"),
				new SeniorDeveloper("Tomi"), new SeniorDeveloper("Toni"),
				new SeniorDeveloper("Anna"), new TeamLeadDeveloper("Robby") };

		for (Developer d:list){
            if ((d instanceof SeniorDeveloper)&(d.getBasicSalary()>=1500)){
                System.out.printf("%12s %10s %10s %10s %10s %10s", d.getName(), d.getAge(), d.getBasicSalary(), d.getSalary(), d.getExperience(), d.isEnglish());
                System.out.println();
            }
        }
		
		// Разделение Developers на списки JuniorDeveloper, MidleDeveloper, SeniorDeveloper, TeamLeadDeveloper
        ArrayList<Developer> junior = new ArrayList();
        ArrayList<Developer> midle = new ArrayList();
        ArrayList<Developer> senior = new ArrayList();
        ArrayList<Developer> lead = new ArrayList();
		
        for (Developer d:list){
            if (d instanceof JuniorDeveloper){
                junior.add(d);
            } else if (d instanceof MidleDeveloper){
            	midle.add(d);
            } else if (d instanceof SeniorDeveloper){	
            	senior.add(d);
            } else if (d instanceof TeamLeadDeveloper){    
                lead.add(d);
            }
        }

        System.out.println();
        System.out.println("Junior Developer:");
        System.out.printf("%12s %12s %15s %15s %10s %15s", "Name", "Age", "Basic Salary", "Experience", "Salary", "English");
        System.out.println();

        for (Developer d:junior){
            System.out.printf("%12s %12s %15s %15s %10s %15s", d.getName(), d.getAge(), d.getBasicSalary(), d.getExperience(), d.getSalary(), d.isEnglish());
            System.out.println();
        }

        System.out.println();
        System.out.println("Midle Developer:");
        System.out.printf("%12s %12s %15s %15s %10s %15s", "Name", "Age", "Basic Salary", "Experience", "Salary", "English");
        System.out.println();

        for (Developer d:midle){
        	System.out.printf("%12s %12s %15s %15s %10s %15s", d.getName(), d.getAge(), d.getBasicSalary(), d.getExperience(), d.getSalary(), d.isEnglish());
            System.out.println();
        }
                
        System.out.println();
        System.out.println("Senior Developer:");
        System.out.printf("%12s %12s %15s %15s %10s %15s", "Name", "Age", "Basic Salary", "Experience", "Salary", "English");
        System.out.println();

        for (Developer d:senior){
        	System.out.printf("%12s %12s %15s %15s %10s %15s", d.getName(), d.getAge(), d.getBasicSalary(), d.getExperience(), d.getSalary(), d.isEnglish());
            System.out.println();
        }

        System.out.println();
        System.out.println("Team Lead:");
        System.out.printf("%12s %12s %15s %15s %10s %15s", "Name", "Age", "Basic Salary", "Experience", "Salary", "English");
        System.out.println();

        for (Developer d:lead){
        	System.out.printf("%12s %12s %15s %15s %10s %15s", d.getName(), d.getAge(), d.getBasicSalary(), d.getExperience(), d.getSalary(), d.isEnglish());
            System.out.println();
        }
        
	}

}
