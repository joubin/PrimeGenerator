package main;

import java.awt.Color;
import java.awt.Font;
import java.math.BigInteger;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GUI() {
		setVisible(true);
		setSize(200, 200);
		//add(primePanel);
		add(new AlphaContainer(primePanel));
		setBackground(new Color(0,0,0,0));

	}
	PrimePanel primePanel = new PrimePanel();
	JLabel text = new JLabel("test");
	Font mainFont = new Font("Sarif", Font.BOLD, 30);

	public void setBigInt(BigInteger a) {
		//text.setText(a.toString());
		primePanel.setBigInt(a);
	}
}
