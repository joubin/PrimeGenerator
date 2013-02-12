package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.math.BigInteger;

import javax.swing.JPanel;

public class PrimePanel extends JPanel {
	private String theString;
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D graphics2d = (Graphics2D) g;
		Color color = new Color(0,0,0,50);
		graphics2d.setPaint(color);
		graphics2d.fill(new Rectangle(0,0,1000,1000));
		color = new Color(0,0,0,255);
		graphics2d.setPaint(color);
		graphics2d.drawString(theString, 100, 100);
		
	}
	public void setBigInt(BigInteger a) {
		 theString = a.toString();
	}
	public PrimePanel(){
		setOpaque(false);
	}
}
