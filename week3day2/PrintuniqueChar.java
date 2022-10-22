package week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintuniqueChar {
	public static void main(String[] args) {
		
	
	//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
	
    String name="babu";   
    char[] nameChar= name.toCharArray();
    System.out.println(nameChar);
	Set<Character> input= new LinkedHashSet<Character>();

	//char ch[]=s.toCharArray();
	//char duplicate[]= dup.to
	for(char i:nameChar)
	{
	boolean dup=input.add(i);
	if(dup==false)
	{ input.remove(i);
	}
	

	}System.out.println(input);
	}
}
