package net.ukr.ksm;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class MyFrame extends JFrame {

	JPanel panel;
	JTextArea area;
	JScrollPane scroller;

	public MyFrame(String data, final MyFile file) {

		setVisible(true);
		setLocation(100, 100);

		panel = new JPanel();
		area = new JTextArea(data, 30, 80);
		area.addKeyListener(new KeyAdapter() { // slyshtel nazatiy knopok
			@Override
			public void keyReleased(KeyEvent arg0) {
				file.setDat(area.getText());
			}
		});

		scroller = new JScrollPane(area); // vertikalnuy skroler
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

		area.setLineWrap(true); // perenos teksta

		panel.add(scroller);
		getContentPane().add(panel);
		pack();

	}

}
