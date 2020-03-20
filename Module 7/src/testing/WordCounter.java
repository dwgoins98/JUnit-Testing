package testing;

import java.util.*;

public class WordCounter {
	
	public static int countWords(String sentence) {
		
		int count = 0;
		
		for(int i = 0; i < sentence.length(); i++) {
			
			if(sentence.charAt(i) == ' ') {
				
				count++;
			}
			
		}
		
		count ++;
		
		return count;
		
	}
	
	public static void main(String[] args) {
		
		Scanner userIn = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		
		String sentence = userIn.nextLine();
		
		System.out.println("This sentence has " + countWords(sentence) + " words.");
		
		
	}

}
