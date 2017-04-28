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

}
