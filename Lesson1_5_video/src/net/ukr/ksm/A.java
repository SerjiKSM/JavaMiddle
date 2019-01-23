package net.ukr.ksm;

import java.util.Date;

/**
 * @author Serhio
 *
 */
public class A {

	/**
	 * The variable "TODAY" stores the day of the week    
	 * 	 
	 * */
	static public String TODAY;
	//public static String TODAY;  
	
	
	static{ // Cтатический конструктор --- вызывается только один раз
		Date date = new Date();
		if(date.getDay() == 0)
			TODAY = "Sunday";
		else if (date.getDay() == 1) 
			TODAY = "Monday";
		else if (date.getDay() == 2) 
			TODAY = "Tuesday";
		else if (date.getDay() == 3) 
			TODAY = "Wednesday";
		else if (date.getDay() == 4) 
			TODAY = "Thursday";
		else if (date.getDay() == 5) 
			TODAY = "Friday";
		else if (date.getDay() == 6) 
			TODAY = "Saturday";
	}
	
	
}
