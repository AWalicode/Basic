package com.wostal.basic;

public class StringChecker {

	public static boolean isFirstSymbolsNumeric(String str, int numberOfSymbols) {
		String letters = str.substring(0, numberOfSymbols);
		try {
			Integer.parseInt(letters);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isLastSymbolsLetter(String str, int numberOfSymbols) {
		String letters = str.substring(str.length() - numberOfSymbols, str.length());
		return letters.chars().allMatch(Character::isAlphabetic);
	}

}
