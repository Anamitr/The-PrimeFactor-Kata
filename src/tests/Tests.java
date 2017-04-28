package tests;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import main.NumberGenerator;

public class Tests {
	
	@Test
	public void generateNumbersWithinRange() {
		ArrayList<String> numbers = new ArrayList<String>();
		final int min = 1, max = 100;
		for(Integer i = min; i < max; i++) {
			numbers.add(i.toString());
		}
		
		NumberGenerator numberGenerator = new NumberGenerator();
		ArrayList<String> numbersToTest = numberGenerator.generate(min, max);
		
		assertEquals(numbersToTest, numbers);
	}
	
	@Test
	public void printPrimes() {
		ArrayList<String> numbers = new ArrayList<String>();
		final int min = 1, max = 100;
		for(Integer i = min; i < max; i++) {
			if(isPrime(i)) numbers.add("prime");
			else numbers.add(i.toString());
		}
		System.out.println(numbers);
		
		NumberGenerator numberGenerator = new NumberGenerator();
		ArrayList<String> numbersToTest = numberGenerator.generate(min, max);
		ArrayList<String> numbersWithPrimes = numberGenerator.findPrimes(numbersToTest);
		
		assertEquals(numbers, numbersWithPrimes);
	}
	
	boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
