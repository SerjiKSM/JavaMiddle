/*
1 Написать метод разбора списка параметров в формате URL: param1=value1&param2=value2&param3=value3. 
В случае ошибки в формате бросать исключение.
 */

package net.ukr.ksm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String strGoogle = null;
		//try {
			System.out.println("Enter your Google URL as shown in example: http://bit.ly/1E3h4r9");
			//strGoogle = reader.readLine();
			strGoogle = "param1=value1&param2=value2&?param3=value3";
		//} catch (IOException e) {
		//	System.out.println("Your URL must be not google! Try to input google URL");
		//}
		String str = strGoogle.substring(strGoogle.indexOf('?') + 1);
		String[][] strMas = urlSplit(str);

		try {
			checkExceptions(strMas);
		} catch (NoParamException e) {
			System.out.println(e.getMessage());
		} catch (NoValueException e) {
			System.out.println(e.getMessage());
		} catch (NoValueNoParamException e) {
			System.out.println(e.getMessage());
		} catch (NoDeviderException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("Parsed parameters & values:");
		System.out.println("- - - - - - - - - - - - - - ");

		for (String[] x : strMas) {

			if (x.length != 0)
				if (x.length == 1) {
					System.out.println(x[0] + " : ");
				} else if (x.length == 2) {
					System.out.println(x[0] + " : " + x[1]);
				}
		}

	}

	public static String[][] urlSplit(String str) {
		String[] splitedByParamsMassive = str.split("&|\\#");
		String[][] pairs = new String[splitedByParamsMassive.length][2];
		for (int i = 0; i < splitedByParamsMassive.length; i++) {
			pairs[i] = splitedByParamsMassive[i].split("=");
		}
		return pairs;
	}

	public static void checkExceptions(String[][] pairs)
			throws NoParamException, NoValueException, NoValueNoParamException,
			NoDeviderException {

		for (int i = 0; i < pairs.length; i++) {
			if (pairs[i].length == 0) {
				throw new NoValueNoParamException(
						"No value and parameters in your URL in fraction " + i);
			} else {
				if (pairs[i].length == 2 && pairs[i][0].length() == 0) {
					throw new NoParamException(
							"No parameter in your URL in fraction " + i);
				} else if (pairs[i].length == 1) {
					throw new NoValueException(
							"No value in your URL in fraction " + i);
				} else if (pairs[i].length > 2) {
					throw new NoDeviderException(
							"No devider \"&\" in your URL in fraction " + i);
				}
			}
		}
	}

}
