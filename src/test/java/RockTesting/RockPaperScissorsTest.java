package RockTesting;

import static org.junit.Assert.*;

import org.junit.Test;

import Rock.RockPaperScissors;
import Rock.RockPaperScissors.RPS;

public class RockPaperScissorsTest {
	private RockPaperScissors rps = new RockPaperScissors();
	
	

	@Test
	public void testComputerwin() {
		assertEquals("Computer didn't win.", "computer", rps.getResult(RPS.ROCK,RPS.PAPER));	
	}
	@Test
	public void testPlayerwin() {
		assertEquals("Player didn't win.", "player", rps.getResult(RPS.PAPER,RPS.ROCK));	
	}
	@Test
	public void testTie() {
		assertEquals("No tie.", "tie", rps.getResult(RPS.PAPER,RPS.PAPER));	
	}
	
	
}
