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

}
