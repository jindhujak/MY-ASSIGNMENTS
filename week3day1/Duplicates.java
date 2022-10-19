package week3day1;

import java.util.Arrays;

public class Duplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code 

		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 

		 * g) Displaying the String without duplicate words	
		 */

				String line ="We learn java basics as part of java sessions in java week1";		
				String result="";
				String[] word=line.split(" ");
				//System.out.println(Arrays.toString(word));
				int length =word.length;
				//System.out.println(length);
				for(int i=0;i<length;i++)
				{					
					for(int j=i+1;j<length;j++)
					{
						if(word[i].equals(word[j]))
						{
						word[j]="";
						}
			}}
				for(String str: word)
				{
					if(str!="")
					{
				result=result+str+" ";
					}
					
				}System.out.println(result);
				
	}}
		//		//System.out.println(line);

//		String sentence="We learn java basics as part of java sessions in java week1", result = "";
//		String[] allWords;
//
//
//
//		// Split the given sentence to get each word as String array
//		allWords = sentence.split(" ");
//		// Use for loop to remove duplicate words
//		for(int i=0; i<allWords.length; i++) {
//			for(int j=i+1; j<allWords.length; j++) {
//				if(allWords[i].equals(allWords[j])) {
//					allWords[j] = "";
//				}
//			}System.out.println(Arrays.toString(allWords));
//		}
//		// Convert to String
//
//		for(String word: allWords) {
//			if(word != "") {
//				result = result + word + " ";
//			
//		}
//		// Display given String after removing duplicates
//		System.out.println("\nSentence after removing duplicate words: " + result);
//
//	}
//
//
//
//}
//
