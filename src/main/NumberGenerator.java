package main;

import java.util.ArrayList;

public class NumberGenerator {
	public static ArrayList<String> generate(int min, int max) {
		ArrayList<String> numbers = new ArrayList<String>();
		for(Integer i = min; i < max; i++) {
			numbers.add(i.toString());
		}
		return numbers;
	}
	
	public static ArrayList<String> findPrimes(ArrayList<String> numbers) {
		for(int i = 0; i < numbers.size(); i++) {
			Integer num = Integer.parseInt(numbers.get(i));
			if(isPrime(num)) numbers.set(i, "prime");
		}
		return numbers;
	}
	
	private static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
