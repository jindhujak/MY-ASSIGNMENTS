package week3day2;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {		
		
//		Declare a String as PayPal India

//		Convert it into a character array

//		Declare a Set as charSet for Character

//		Declare a Set as dupCharSet for duplicate Character

//		Iterate character array and add it into charSet

//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print it

	
	String str= "PayPal India";
	String s= str.toLowerCase();
	char ch[]=s.toCharArray();
	Set<Character> charSet=new LinkedHashSet<Character>();
	Set<Character> dupCharSet=new LinkedHashSet<Character>();
	
	
	for(char i:ch)
	{
	boolean dup=charSet.add(i);
	if(dup==false)
	{
	  dupCharSet.add(i);
	}
	}
	
	System.out.println(charSet);
	System.out.println(dupCharSet);
	for(Character i:ch)
	{
		
	if(dupCharSet.contains(i)||i==' ')
	{
		charSet.remove(i);
	}
		
	}
	//System.out.println(dupCharSet);
	System.out.println("List with duplicatecharacter removed :" +charSet);
	
	
//	charSet.removeAll(dupCharSet);
//	System.out.println(""charSet);
}}
	
	
	
	



