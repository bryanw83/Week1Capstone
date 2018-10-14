package Week1Capstone;

import java.util.Scanner;

public class testPage {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String input =  "test";
		int i;
		char firstVow;
		//String[] wordCons = input.split(firstVow);
		String e1 = "e";
		String[] vowel = {"a","e","i","o","u","A","E","I","O","U"};
		
		i = vowel.length;
			
		

		// char firstLetter = input.charAt(0); //get the first letter
		// input = input.substring(1); //remove the first letter from the input string
		// input = input + firstLetter + "ay";
		// System.out.println(input);
		// add first letter and "ay" to end of input string
		scnr.close();
	}

	public static boolean isVowel(char ans) {
	if (ans == 'a' || ans == 'e' || ans == 'i' || ans == 'o' || ans == 'u' || ans == 'A' || ans == 'E' || ans == 'I'
				|| ans == 'O' || ans == 'U') {
	return true;} return false;
	
	

	}
	public static int indexOfFirstVowel(String word){
		   int i;
		    for(i=0; i<word.length();i++){  
		     switch(word.charAt(i)){
		        case 'a':
		        case 'e':
		        case 'i':
		        case 'o':
		        case 'u':
		        case 'y':
		        return i;
		     }
		    }
		   return -1;
		}
}
