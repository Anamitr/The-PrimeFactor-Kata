package tests;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import main.PrimeCompositeFinder;

public class Tests {
	
	@Test
	public void generateNumbersWithinRange() {
		ArrayList<String> numbers = new ArrayList<String>();
		final int min = 1, max = 100;
		for(Integer i = min; i < max; i++) {
			numbers.add(i.toString());
		}		

		ArrayList<String> numbersToTest = PrimeCompositeFinder.generate(min, max);
		
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

		ArrayList<String> numbersToTest = PrimeCompositeFinder.generate(min, max);
		ArrayList<String> numbersWithPrimes = PrimeCompositeFinder.findPrimes(numbersToTest);
		
		assertEquals(numbers, numbersWithPrimes);
	}
	
	@Test
	public void printCompositeButNotEven() {
		ArrayList<String> numbers = new ArrayList<String>();
		final int min = 1, max = 100;
		for(Integer i = min; i < max; i++) {
			if(isCompositeButNotEven(i)) numbers.add("composite");
			else numbers.add(i.toString());
		}
		System.out.println(numbers);
		
		ArrayList<String> numbersToTest = PrimeCompositeFinder.generate(min, max);
		ArrayList<String> numbersWithComposites = PrimeCompositeFinder.findComposites(numbersToTest);
		
		assertEquals(numbers, numbersWithComposites);
	}
	
	@Test
	public void printNumbersButPrimesAndComposites() {
		ArrayList<String> numbers = new ArrayList<String>();
		final int min = 1, max = 100;
		for(Integer i = min; i < max; i++) {
			if(isPrime(i)) numbers.add("prime");
			else if(isCompositeButNotEven(i)) numbers.add("composite");
			else numbers.add(i.toString());
		}
		System.out.println(numbers);
		
		ArrayList<String> numbersToTest = PrimeCompositeFinder.generate(min, max);
		ArrayList<String> numbersWithComposites = PrimeCompositeFinder.findComposites(numbersToTest);
		ArrayList<String> numbersWithPrimesAndComposites = PrimeCompositeFinder.findPrimes(numbersWithComposites);
		
		assertEquals(numbers, numbersWithPrimesAndComposites);
	}
	
	@Ignore
	@Test
	public void acceptAnyRange() {
		for(int min = 0; min < Integer.MAX_VALUE; min++) {
			for(int max = min+1; max < Integer.MAX_VALUE; max++) PrimeCompositeFinder.generate(min, max);
		}
	}
	
	boolean isPrime(int n) {
		if (n == 1) return false;
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	boolean isCompositeButNotEven(int n) {
		if( n == 1) return false;
		if(isPrime(n)) return false;
		else if(n%2 == 0) return false;
		else return true;
	}

}
