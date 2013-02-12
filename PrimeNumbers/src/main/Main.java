/*
 * Author: Joubin Jabbari
 * Objective: Generate Prime Numbers
 * Description: This algorithm will generate prime numbers until your computer runs out of ram. 
 * 				It has 3 constraints on what is a prime number,
 * 					i) It has to be odd
 * 					ii) all the numbers that are could be divisible by it are off
 * 					iii) if square root of any number is greater than the prime, the number is prime
 * 				This algorithm will only print once every 10 seconds to save cpu tasks. I would increase it to a minute to speed it up
 */

package main;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
	static ArrayList<BigInteger> arrayList = new ArrayList<BigInteger>();
	static BigInteger primeNumber = new BigInteger("0");
	static BigInteger itIsPrime = new BigInteger("0");

	static BigInteger primeBigInteger = new BigInteger("3");
	static BigInteger loopInteger = new BigInteger("0");
	static int counter = 0;
	static Timer timer = new Timer();

	//static GUI gui = new GUI();

	public static void main(String[] args) {
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				arrayList.add(itIsPrime);
				 System.out.println(itIsPrime.toString());

			}
		}, 0, 1);

		while (true) {
			if (testPrime(primeBigInteger)) {
				itIsPrime = primeBigInteger;
			}

			primeBigInteger = primeBigInteger.add(BigInteger.valueOf(2));
		}

	}

	static boolean testPrime(BigInteger a) {
		for (loopInteger = BigInteger.valueOf(3); loopInteger.pow(2).compareTo(
				a) <= 0; loopInteger = loopInteger.add(BigInteger.valueOf(2)))
			if (a.mod(loopInteger).compareTo(BigInteger.valueOf(0)) == 0) {
				return false;
			}
		return true;
	}

}
