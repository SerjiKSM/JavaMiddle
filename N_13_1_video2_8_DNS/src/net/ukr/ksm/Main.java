package net.ukr.ksm;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class Main {

	public static void main(String[] args) {

        final String hostName = "prog.kiev.ua";
        try {
			InetAddress ipaddress = InetAddress.getByName(hostName);
			System.out.println("IP Address: " + ipaddress.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
