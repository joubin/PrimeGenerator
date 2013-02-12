package graphGenerator;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.ObjectInputStream.GetField;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Grapher extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	HashMap<Integer, Integer> barsHashMap = new HashMap<Integer, Integer>();
	int numberOfBars = 10;
	int maxNum = 0;
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Integer i : barsHashMap.keySet()){
			if(barsHashMap.get(i) > maxNum){
				maxNum = barsHashMap.get(i);
			}
		}
		Graphics2D graphics2d = (Graphics2D) g;
		int counter = 0;
		for(int i = 0; i < getWidth(); i = i+getWidth()/numberOfBars){
			counter++;
			graphics2d.drawRect(i , 0, getWidth()/numberOfBars, getHeight()/2*barsHashMap.get(counter)/maxNum);
		}

	}
	public void setDataStructor(ArrayList<BigDecimal> ratios) {

		for (BigDecimal decimal : ratios) {
			float decimalFloat = decimal.floatValue();
			putFloatInHash(decimalFloat);
		}
	}

	private void putFloatInHash(float barVal){
		int counter = 0;
		for( float i = 1/(float) numberOfBars; i <= 1; i =  i+1/(float) numberOfBars ){
			++counter;
			if(barVal < i){

				Integer current = barsHashMap.get(counter);
				if (current == null) {
					current = 0;
				}
				barsHashMap.put(counter, ++current);
				//System.out.println(barsHashMap.toString());
				break;
			}
		}
		
	}
	public void setGraphData(ArrayList<BigDecimal> decimals){
		 setDataStructor(decimals);

	}
}
