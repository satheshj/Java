package LearningJava;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordsRepition {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.nextLine();
		int count;
		//repetition of every letter
		for(int i = 0; i < str.length(); i++) {
			count = 0;
			for(int j = 0 ; j < str.length();j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
				
			}
			System.out.println(str.charAt(i)+" repeated "+count+" times");
		}
		count = 0;
		System.out.println("Enter the letter");
		String letter = sc.nextLine();
		//repetition for specific letter
		
		for (int j = 0; j < str.length(); j++) {
			if (letter.charAt(0) == str.charAt(j)) {
				count++;
			}

		}

		System.out.println(letter + " repeated " + count + " times");
		
		//repetition of word in string
		count  = 0;
		System.out.println("Enter a sentence");
		String sentence = sc.nextLine();
		StringTokenizer st = new StringTokenizer(sentence);
		System.out.println("Enter a word");
		String word = sc.nextLine();
		while(st.hasMoreTokens()) {
			
			if(st.nextToken().contains(word)) {
				count++;
			}
			
		}
		System.out.println(word+" repeated "+count+" times");
	}
}
