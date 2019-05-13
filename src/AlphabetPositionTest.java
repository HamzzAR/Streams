import static org.junit.Assert.*;

import org.junit.Test;


public class AlphabetPositionTest {
	AlphabetPosition a = new AlphabetPosition();
	
	@Test
	public void test1ReplaceLetterWithPosition() {
		String result = a.replaceLetterWithPosition("hello").toString();
		String expected = " 8 5 12 12 15";
		assertEquals(result,expected);
	}
	
	@Test
	public void test2ReplaceLetterWithPosition() {
		String result = a.replaceLetterWithPosition("hello !!!&&& b").toString();
		String expected = " 8 5 12 12 15 2";
		assertEquals(result,expected);
	}
	
	@Test
	public void test3ReplaceLetterWithPosition() {
		String result = a.replaceLetterWithPosition("$$$$%@>>>  123123 say hello !!!&&& b").toString();
		String expected = " 19 1 25 8 5 12 12 15 2";
		assertEquals(result,expected);
	}


}
