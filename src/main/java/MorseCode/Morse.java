package MorseCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Morse {

	public String covertLetter(String string) {
		
		String toReturn = "";
		
		Map<String, String> myMap = new HashMap<>();
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String code = ".- / -... / -.-. / -.. / . / ..-. / --. / .... / .. / .--- /"
				+ " -.- / .-.. / -- / -. / --- / .--. / --.- / .-. / ... / - / ..- /"
				+ " ...- / .-- / -..- / -.-- / --..";
		
		String[] lettersSplit = letters.split("");
		String[] codeSplit = code.split("/");
		
		int count  = 0;
		for (String s : lettersSplit) {
			myMap.put(s,codeSplit[count].trim());
			count++;
		}
		
		int count2 = 0;
		for (Entry<String, String> key : myMap.entrySet()) {
		    if(key.getValue().equals(string)){
		    	toReturn = key.getKey().trim();
		    }
		}
	
		
		return toReturn;
	}

	public String convertMorseCode(String string) {
		
		String output = "";
		
		String[] morseLetters = string.split(" ");
		
		for (int x = 0; x < morseLetters.length; x++)
		{
			if (morseLetters[x].equals("/"))
			{
				if(x!= morseLetters.length - 1)
				{
					output = output + " ";
				}
				
			}
			else
			{
				output = output + covertLetter(morseLetters[x]);
				
			}
		}
		
		System.out.println(output);

		return output;
	}

}
