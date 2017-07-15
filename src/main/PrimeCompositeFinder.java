package main;

import java.util.ArrayList;

public class PrimeCompositeFinder {

	public static ArrayList<String> generateStringNumberArray(int min, int max) {
		ArrayList<String> generatedNumbers = new ArrayList<String>();
		for (Integer i = min; i <= max; i++)
			generatedNumbers.add(i.toString());
		return generatedNumbers;
	}
	
	public static ArrayList<String> findPrimes(ArrayList<String> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i).matches("^-?\\d+$")) {
				Integer num = Integer.parseInt(numbers.get(i));
				if (isPrime(num))
					numbers.set(i, "prime");
			}
		}
		return numbers;
	}
	
	private static boolean isPrime(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
