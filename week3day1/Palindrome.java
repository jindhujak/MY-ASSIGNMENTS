package week3day1;

import java.util.Arrays;

public class Palindrome {
public static void main(String[] args) {
	
	
	String given="Madam";
	String rev="";
	int size= given.length();
	char[] ch= given.toCharArray();
	//System.out.println(Arrays.toString(ch));
	for(int i=size-1;i>=0;i--)
	{
		rev=rev+ch[i];
	}
	System.out.println("The given word is : " +given);
	System.out.println("The reversed word is : " +rev);
	if(rev.equalsIgnoreCase(given))
		System.out.println("Given word is a palindrome");
	else
		System.out.println("Given word is not a palindrome");
}}
	