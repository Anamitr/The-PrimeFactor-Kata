package main;

import java.util.ArrayList;

public class PrimeCompositeFinder {
	
	public static ArrayList<String> generateStringNumberArray(int min, int max) {
		ArrayList<String> generatedNumbers = new ArrayList<String>();
		for(Integer i = min; i <= max; i++)
			generatedNumbers.add(i.toString());
		return generatedNumbers;
	}
}
