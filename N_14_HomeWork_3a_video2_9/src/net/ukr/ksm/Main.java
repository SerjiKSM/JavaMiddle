/*
 * 
 * 3.Write server kotoruy will send information about system and  ¹ zaprosa
 * 
 * */

package net.ukr.ksm;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Server server = new Server(8000);
		try {
			server.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
