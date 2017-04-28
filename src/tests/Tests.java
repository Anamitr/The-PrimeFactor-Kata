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

		ArrayList<String> numbersToTest = NumberGenerator.generate(min, max);
		
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

		ArrayList<String> numbersToTest = NumberGenerator.generate(min, max);
		ArrayList<String> numbersWithPrimes = NumberGenerator.findPrimes(numbersToTest);
		
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
		
		ArrayList<String> numbersToTest = NumberGenerator.generate(min, max);
		ArrayList<String> numbersWithComposites = NumberGenerator.findComposites(numbersToTest);
		
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
		
		ArrayList<String> numbersToTest = NumberGenerator.generate(min, max);
		ArrayList<String> numbersWithComposites = NumberGenerator.findComposites(numbersToTest);
		ArrayList<String> numbersWithPrimesAndComposites = NumberGenerator.findPrimes(numbersWithComposites);
		
		assertEquals(numbers, numbersWithPrimesAndComposites);
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
