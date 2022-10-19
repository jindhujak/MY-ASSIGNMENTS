package week3day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		/*
		 * Pseudo Code

		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		String x="stOps";
		String y="posTs";
		String one=x.toLowerCase();
		String two=y.toLowerCase();
		char[] ch1=one.toCharArray();
		char[] ch2=two.toCharArray();

		int length1=one.length();
		int length2=two.length();
		
    	Arrays.sort(ch1);
    	String str1=Arrays.toString(ch1);
    	System.out.println(str1);
    	Arrays.sort(ch2);
    	String str2=Arrays.toString(ch2);
    	System.out.println(str2);

		
		if(length1==length2)
		{
			System.out.println("checking for anagram");
		}else System.out.println("Given word is not an anagram");

		if(str1.equals(str2))
			System.out.println("Given word is an anagram");
		else
			System.out.println("Given word is not an anagram");
		}


	}

