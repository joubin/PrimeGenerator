package prime2;

import java.util.ArrayList;
import java.lang.Math;

public class Main {

	static ArrayList<Integer> arraylist = new ArrayList<Integer>();
	public static void main(String[] args) {
		arraylist.add(2); 
		arraylist.add(3);
		arraylist.add(5);
		int x = 1000000000;
		for (int i = 7; i <= x; i = i+2) {
			isPrime(i);
		}
	}
	
	static int isPrime(int totest){
		for (int i = 0; i < arraylist.indexOf(Math.sqrt(totest)) && Math.pow(i, 2) < arraylist.get(arraylist.size()-1); i++){
			if (totest % arraylist.get(i) == 0) {
				return 1;
			}
		}
		arraylist.add(totest);
		System.out.println(totest);
		return 0;
	}



}
