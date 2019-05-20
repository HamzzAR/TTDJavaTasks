package Doggos;

import java.util.ArrayList;
import java.util.List;

public class Doggos {

	public List<String> listNonDoggoPos(int inputNumber) {
		String endNotation = "";
		int countEveryTen = 1;
		List<String> listOfPositions = new ArrayList<>();
		for (int j = 1; j <= 100; j++) {

			if (j == inputNumber) {
				if (!(j > 10 & j < 21)) {
					countEveryTen++;
				}
				continue;
			}
			

			endNotation = "th";
			if (!(j > 10 & j < 21)) {
				switch (countEveryTen) {
				case 1:
					endNotation = "st";
					break;
				case 2:
					endNotation = "nd";
					break;
				case 3:
					endNotation = "rd";
					break;
				}

				countEveryTen++;
				if (countEveryTen == 11) {
					countEveryTen = 1;
				}

			}
			listOfPositions.add(("" + j + endNotation));
		}
		listOfPositions.stream().forEach(x -> System.out.println(x));
		return listOfPositions;
	}

}
