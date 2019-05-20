package Rock;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	private int cWin, pWin, tie, rock, paper, scissor;

	public enum RPS {
		ROCK, PAPER, SCISSORS
	}

	public void startMatch() {
		cWin = pWin = tie = rock = paper = scissor = 0;
		int games;
		for (games = 1; games <= 10; games++) {
			if (start() == 0)
				break;
		}
		System.out.println("Total games played: " + cWin + pWin + tie);
		System.out.println("Computer wins: " + cWin + ", " + (float) cWin / (cWin + pWin + tie) + "%");
		System.out.println("Human wins: " + pWin + ", " + (float) pWin / (cWin + pWin + tie) + "%");
		System.out.println("Ties: " + tie + ", " + (float) tie / (cWin + pWin + tie) + "%");
		int mostCommon = Math.max(Math.max(rock, paper), scissor);
		System.out.print("Most commonly picked: ");
		if(mostCommon==rock) System.out.print("rock");
		System.out.print(", " + (float) mostCommon / (rock + paper + scissor) + "%\n");
	}

	public int start() {
		String playerMove, computerMove;
		RPS rpsPlayerMove = RPS.ROCK, rpsComputerMove = RPS.ROCK;

		playerMove = getComputerMove();
		System.out.print("Player picks: ");
		switch (playerMove) {
		case "r":
			rpsPlayerMove = RPS.ROCK;
			System.out.print(rpsPlayerMove + "\n");
			rock++;
			break;
		case "p":
			rpsPlayerMove = RPS.PAPER;
			System.out.print(rpsPlayerMove + "\n");
			paper++;
			break;
		case "s":
			rpsPlayerMove = RPS.SCISSORS;
			System.out.print(rpsPlayerMove + "\n");
			scissor++;
			break;
		case "q":
			return 0;
		}

		computerMove = getComputerMove();
		System.out.print("Computer picks: ");
		switch (computerMove) {
		case "r":
			rpsComputerMove = RPS.ROCK;
			System.out.print("Rock\n");
			rock++;
			break;
		case "p":
			rpsComputerMove = RPS.PAPER;
			System.out.print("Paper\n");
			paper++;

			break;
		case "s":
			rpsComputerMove = RPS.SCISSORS;
			System.out.print("Scissors\n");
			scissor++;
			break;
		}

		String result = getResult(rpsPlayerMove, rpsComputerMove);
		System.out.print(result);
		if (result.equals("player")) {
			pWin++;
			System.out.println(" WON");
		} else if (result.equals("computer")) {
			cWin++;
			System.out.println(" WON");
		} else {
			tie++;
		}
		return 1;
	}

	public String getPlayerMove() {
		String a;
		Scanner myObj;
		while (true) {
			myObj = new Scanner(System.in); // Create a Scanner object
			System.out.println("Pick r/p/s or q to quit.");
			a = myObj.nextLine();
			if (a.equals("r") || a.equals("p") || a.equals("s") || a.equals("q")) {
				myObj.close();
				return a;
			} else {
				System.out.println("Invalid option picked");
			}
		}
	}

	public String getComputerMove() {
		String[] arr = { "r", "p", "s" };
		Random r = new Random();
		int randomNumber = r.nextInt(arr.length);
		return arr[randomNumber];

	}

	public String getResult(RPS playerMove, RPS ComputerMove) {
		switch (playerMove) {
		case PAPER:
			switch (ComputerMove) {
			case PAPER:
				return "tie";
			case ROCK:
				return "player";
			case SCISSORS:
				return "computer";
			}
			break;
		case ROCK:
			switch (ComputerMove) {
			case PAPER:
				return "computer";
			case ROCK:
				return "tie";
			case SCISSORS:
				return "player";
			}
			break;
		case SCISSORS:
			switch (ComputerMove) {
			case PAPER:
				return "player";
			case ROCK:
				return "computer";
			case SCISSORS:
				return "tie";
			}
			break;
		}

		return "Error";

	}
}
