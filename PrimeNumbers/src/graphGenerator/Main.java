package graphGenerator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
	static int index = 0;
	static int mc = 6;
	static int LIMIT = 30;
	static ArrayList<BigDecimal> ratio = new ArrayList<BigDecimal>();

	static BigInteger primeNumber = new BigInteger("0");
	static BigInteger itIsPrime = new BigInteger("0");

	static BigInteger primeBigInteger = new BigInteger("3");
	static BigInteger loopInteger = new BigInteger("0");
	static int counter = 0;
	
	static GUI gui = new GUI();

	// static Timer timer = new Timer();

	public static void main(String[] args) {


		while (itIsPrime.compareTo(new BigInteger(String.valueOf(LIMIT))) < 0) {
			if (testPrime(primeBigInteger)) {
				itIsPrime = primeBigInteger;
			}

			primeBigInteger = primeBigInteger.add(BigInteger.valueOf(2));
		}

		for (BigDecimal decimal : ratio) {
			System.out.println(decimal.toString());
		}
		gui.getArray(ratio);
		gui.repaint();
	}

	static boolean testPrime(BigInteger a) {
		for (loopInteger = BigInteger.valueOf(3); loopInteger.pow(2).compareTo(
				a) <= 0; loopInteger = loopInteger.add(BigInteger.valueOf(2)))
			if (a.mod(loopInteger).compareTo(BigInteger.valueOf(0)) == 0) {
				ratio.add(new BigDecimal(loopInteger, mc).divide(
						new BigDecimal(sqrtBigInt(a), mc), mc));
				System.out.println("test");
				index++;
				return false;
			}
		return true;
	}

	static BigInteger sqrtBigInt(BigInteger sq) {
		BigInteger loopInteger2 = new BigInteger("0");

		for (loopInteger2 = BigInteger.valueOf(3); loopInteger2.pow(2)
				.compareTo(sq) <= 0; loopInteger2 = loopInteger2.add(BigInteger
				.valueOf(2))) {
			//The lack of code here is intentional 

		}
		return loopInteger2;
	}
	
}
