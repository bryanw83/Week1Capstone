package Week1Capstone;

import java.util.Scanner;

public class PigLatinTranslator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userName;
		String pigWord;
		String userChoice = null;
		

		System.out.println("Hi there! What's your name?");
		userName = scnr.nextLine();

		System.out.println("Nice to meet you, " + userName + "! Welcome to the Pig Latin translator!'");
		System.out.println();
		
		do {

		System.out.println("Please enter a word that you would like to translate: ");
		pigWord = scnr.next();
		pigWord = pigWord.toLowerCase();
		System.out.println();

		char wordLet = pigWord.charAt(0);
		boolean ans = isVowel(wordLet);
		if (ans == true) {
			System.out.print("The translation for that would be: ");
		System.out.println(pigWord + "way");
		}else if (ans != true){
			int firstVowel = firstVowelIndex(pigWord);
			int wordLong = pigWord.length();
			
			String wordCons = pigWord.substring(0,firstVowel);
			String wordHalf = pigWord.substring(firstVowel, wordLong);
			System.out.println("The translation for that would be: " + wordHalf + wordCons + "ay");
		}
			System.out.println();
			System.out.println("Would you like to try again? (y/n)");
			userChoice = scnr.next();
		
		 }while (userChoice.equalsIgnoreCase("y"));
		
		System.out.println("Ok, thanks for using the translator. Have a nice day!");

		scnr.close();

	}

	public static boolean isVowel(char ans) {
		if (ans == 'a' || ans == 'e' || ans == 'i' || ans == 'o' || ans == 'u' || ans == 'A' || ans == 'E' || ans == 'I'
				|| ans == 'O' || ans == 'U') {
			return true;
		}
		return false;

	}
	public static int firstVowelIndex(String word){
		   int i;
		    for (i = 0; i < word.length(); i++){  
		     switch(word.charAt(i)){
		        case 'a':
		        case 'e':
		        case 'i':
		        case 'o':
		        case 'u':
		        return i;
		     }
		    }
		   return -1;
		}
}
