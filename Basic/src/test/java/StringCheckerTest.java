import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wostal.basic.StringChecker;

class StringCheckerTest {

	@Test
	void isFirstSymbolsNumericTest() {
		assertTrue(StringChecker.isFirstSymbolsNumeric("1234aeruighaeiugh34", 4));
		assertFalse(StringChecker.isFirstSymbolsNumeric("1234aeruighaeiugh34", 5));
	}
	
	@Test
	void isLastSymbolsLetterTest() {
		assertTrue(StringChecker.isLastSymbolsLetter("1234aeruighaeiugh34sssa", 4));
		assertFalse(StringChecker.isLastSymbolsLetter("1234aeruighaeiugh34sssa", 5));
	}

}
