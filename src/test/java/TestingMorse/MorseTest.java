package TestingMorse;

import static org.junit.Assert.*;

import org.junit.Test;
import MorseCode.Morse;

public class MorseTest {

	Morse morse = new Morse();
	
//	@Test
//	public void convertLetterTest() {
//		assertEquals(morse.covertLetter("h"),"....");
//	}
	
	@Test
	public void convertMorseCodeTest() {
		assertEquals(morse.convertMorseCode(".... . .-.. .-.. ---"),"hello");
	}
	
	@Test
	public void convertMorseCodeTest2() {
		assertEquals(morse.convertMorseCode(".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... /"),"hello daily programmer good luck on the challenges");
	}
	
}
