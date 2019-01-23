package net.ukr.ksm;

import java.io.*;

public class CopyF extends Thread {

	String inputFileName;
	String outputText;
	File file;

	public CopyF(final String inputF, final String outputF) {
		this.inputFileName = inputF;
		this.outputText = outputF;
		file = new File(inputF);
	}

	@Override
	public void run() {
		synchronized (CopyF.this) {
			StringBuilder sb = new StringBuilder();
			try {
				String oldFile = readF();
				sb.append(oldFile);
				sb.append(outputText);
				write(sb.toString());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		}
	}

	public String readF() throws FileNotFoundException {
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new FileReader(
					file.getAbsoluteFile()));
			try {
				String s;
				while ((s = in.readLine()) != null) {
					sb.append(s);
					sb.append("\n");
				}
			} finally {
				in.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return sb.toString();
	}

	public void write(String text) {
		try {
			PrintWriter out = new PrintWriter(file);
			try {
				out.print(text);
			} finally {
				out.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
