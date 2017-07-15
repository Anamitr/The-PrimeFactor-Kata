package tests;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import main.PrimeCompositeFinder;

public class Tests {
	
	@Test
	public void shouldGenerateNumbersWithinRange() {
		ArrayList<String> wantedNumbers = new ArrayList<String>();
		ArrayList<String> generatedNumbers = new ArrayList<String>();
		final Integer min = new Integer(1);
		final Integer max = new Integer(100);
		
		for(Integer i = min; i <= max; i++)
			wantedNumbers.add(i.toString());
		
		generatedNumbers = PrimeCompositeFinder.generateStringNumberArray(1, 100);
		assertEquals(wantedNumbers, generatedNumbers);
	}
	
	@Test
	public void shouldPrintPrimeInsteadOfNumber() {
		ArrayList<String> wantedNumbers = new ArrayList<String>();
		final int min = 1, max = 100;
		for(Integer i = min; i <= max; i++) {
			if(isPrime(i)) wantedNumbers.add("prime");
			else wantedNumbers.add(i.toString());
		}
		System.out.println(wantedNumbers);		

		ArrayList<String> numbersToTest = PrimeCompositeFinder.generateStringNumberArray(min, max);
		ArrayList<String> numbersWithPrimes = PrimeCompositeFinder.findPrimes(numbersToTest);
		
		assertEquals(wantedNumbers, numbersWithPrimes);
	}
	
	boolean isPrime(int n) {
		if (n == 1) return false;
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
