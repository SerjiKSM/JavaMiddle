/*
 * Write method for hands add word and save on disc 
 * */

package net.ukr.ksm;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		boolean isExit = false;

		Map<String, String> map = new HashMap<String, String>();

		map = getMap(map);
		
		do {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Do you want to enter new word?");

			try {
				String mContinue = reader.readLine();

				if (mContinue.equals("yes")) {
					isExit = false;
					System.out.println("Enter word in English.");
					String englishWord = reader.readLine();

					System.out.println("Enter word in Russian.");
					String russianWord = reader.readLine();

					map.put(englishWord, russianWord);
				} else {
					isExit = true;

					try {

						// write
						//*FileOutputStream fileOutputStream = new FileOutputStream(getClass().getResourceAsStream("/resource/dictionary.out").toString());
						FileOutputStream fileOutputStream = new FileOutputStream("d:\\test\\dictionary.out");
						
						ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

						try {
							objectOutputStream.writeObject(map);
						} finally {
							objectOutputStream.flush();
							objectOutputStream.close();
						}

					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} while (!isExit);

	}

	
	public static Map<String, String> getMap(Map map) {
		// read
		try {
			
			FileInputStream fileInputStream = new FileInputStream("d:\\test\\dictionary.out");
			//FileInputStream fileInputStream = new FileInputStream(getClass().getResourceAsStream("/resource/dictionary.out").toString());
					
			ObjectInputStream objectInputStream = new ObjectInputStream(
					fileInputStream);

			try {
				map = (Map) objectInputStream.readObject();

			} finally {
				objectInputStream.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return map;

	}
	
}
