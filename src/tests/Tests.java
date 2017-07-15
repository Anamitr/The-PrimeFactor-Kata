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

		for (Integer i = min; i <= max; i++)
			wantedNumbers.add(i.toString());

		generatedNumbers = PrimeCompositeFinder.generateStringNumberArray(1, 100);
		assertEquals(wantedNumbers, generatedNumbers);
	}

	@Test
	public void shouldPrintPrimeInsteadOfNumber() {
		ArrayList<String> wantedNumbers = new ArrayList<String>();
		final int min = 1, max = 100;
		for (Integer i = min; i <= max; i++) {
			if (isPrime(i))
				wantedNumbers.add("prime");
			else
				wantedNumbers.add(i.toString());
		}
		System.out.println(wantedNumbers);

		ArrayList<String> numbersToTest = PrimeCompositeFinder.generateStringNumberArray(min, max);
		ArrayList<String> numbersWithPrimes = PrimeCompositeFinder.findPrimes(numbersToTest);

		assertEquals(wantedNumbers, numbersWithPrimes);
	}

	@Test
	public void shouldPrintCompositeButNotEven() {
		ArrayList<String> wantedNumbers = new ArrayList<String>();
		final int min = 1, max = 100;
		for (Integer i = min; i <= max; i++) {
			if (isCompositeButNotEven(i))
				wantedNumbers.add("composite");
			else
				wantedNumbers.add(i.toString());
		}
		System.out.println(wantedNumbers);

		ArrayList<String> numbersToTest = PrimeCompositeFinder.generateStringNumberArray(min, max);
		ArrayList<String> numbersWithComposites = PrimeCompositeFinder.findNotEvenComposites(numbersToTest);

		assertEquals(wantedNumbers, numbersWithComposites);
	}

	@Test
	public void shouldPrintNumbersButPrimesAndComposites() {
		ArrayList<String> wantedNumbers = new ArrayList<String>();
		final int min = 1, max = 100;
		for (Integer i = min; i <= max; i++) {
			if (isPrime(i))
				wantedNumbers.add("prime");
			else if (isCompositeButNotEven(i))
				wantedNumbers.add("composite");
			else
				wantedNumbers.add(i.toString());
		}
		System.out.println(wantedNumbers);

		ArrayList<String> numbersToTest = PrimeCompositeFinder.generateStringNumberArray(min, max);
		ArrayList<String> numbersWithComposites = PrimeCompositeFinder.findPrimes(numbersToTest);
		ArrayList<String> numbersWithPrimesAndComposites = PrimeCompositeFinder
				.findNotEvenComposites(numbersWithComposites);

		assertEquals(wantedNumbers, numbersWithPrimesAndComposites);
	}

	@Ignore
	@Test
	public void shouldAcceptAnyRange() {
		for (int min = 0; min < Integer.MAX_VALUE; min++) {
			for (int max = min + 1; max < Integer.MAX_VALUE; max++)
				PrimeCompositeFinder.generateStringNumberArray(min, max);
		}
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

	boolean isCompositeButNotEven(int n) {
		if (n == 1)
			return false;
		if (isPrime(n))
			return false;
		else if (n % 2 == 0)
			return false;
		else
			return true;
	}
}
