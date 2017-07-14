package main;

import java.util.ArrayList;

public class PrimeCompositeFinder {

	public static ArrayList<Integer> generateIntegerArray(int min, int max) {
		ArrayList<Integer> generatedNumbers = new ArrayList<Integer>();
		for(int i = min; i <= max; i++)
			generatedNumbers.add(new Integer(i));
		return generatedNumbers;
	}
	
}
