package tests;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import main.PrimeCompositeFinder;

public class Tests {
	
	@Test
	public void shouldGenerateNumbersWithinRange() {
		ArrayList<Integer> wantedNumbers = new ArrayList<Integer>();
		ArrayList<Integer> generatedNumbers = new ArrayList<Integer>();
		final Integer min = new Integer(1);
		final Integer max = new Integer(100);
		
		for(int i = min; i <= max; i++)
			wantedNumbers.add(new Integer(i));
		
		generatedNumbers = PrimeCompositeFinder.generateIntegerArray(1, 100);
		assertEquals(wantedNumbers, generatedNumbers);
	}

}
