package testing;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class countWordsTest {

	@Test
	void test() {
		
		WordCounter test = new WordCounter();
		int output = test.countWords("Hello, my name is Daniel and I'm stuck inside because of the coronavirus. Lol just kidding because I have to work");
		assertEquals(21, output);
	}

}
