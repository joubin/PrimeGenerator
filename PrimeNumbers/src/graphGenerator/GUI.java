package graphGenerator;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.swing.JFrame;

public class GUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Grapher grapher = new Grapher();
	public void getArray(ArrayList<BigDecimal> bigDecimals){
		grapher.setGraphData(bigDecimals);
	}
	
	public GUI(){
		setSize(600, 600);
		add(grapher);
		setVisible(true);
		
	}
	

}
