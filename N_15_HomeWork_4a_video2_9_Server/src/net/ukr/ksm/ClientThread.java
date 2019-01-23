
package net.ukr.ksm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;

public class ClientThread extends Thread {

	private Socket socket;
	private List<Message> msg;
	private int pos = 0;
	private String login;
	
	public ClientThread(Socket socket, List<Message> msg) {
		this.socket = socket;
		this.msg = msg;
	}
	
	private void listToBytes(OutputStream os) throws IOException {
		final int sz = msg.size();
		Message m = null;
		
		for (int i = pos; i < sz; i++) {
			
			msg.get(i);
			
			if(m.to.isEmpty() || (( ! m.to.isEmpty()) && (m.to.equals(login)))) {
				m.writeToStream(os);
			}	
			
		}
					
		pos = msg.size();
	}
	
	public void run() {
		try {
			final InputStream is = socket.getInputStream();
			final OutputStream os = socket.getOutputStream();
			
			while ( ! isInterrupted()) {
				if (pos < msg.size())
					listToBytes(os);
				
				Message m = Message.readFromStream(is);
				if (m != null){
					if (login == null) {
						login = m.from;
					
						Message info = new Message();
						info.from = "Server";
						info.to = "";
						info.text = "User " + login + " logged in!";
						
						msg.add(info);
					}
					else
						msg.add(m);
				}
				
			}
			
			socket.close();
			
		} catch (Exception e) {
			return;
		}
	}
}
