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
}
