package week3day2;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

public class MissingElement {
	public static void main(String[] args) {
		/*
		 * Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * 
		 */
		
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		Integer[] data= {6,4,3,4,1,3,2,8,0,9};
		
		Set input=new TreeSet(Arrays.asList(data));
		//Collections.sort(input); is for list alone not for set
		System.out.println(input);
		List<Integer> list=new ArrayList<Integer>(input);
		//SET to LIST conversation doesn't need any Array.aslist(input)-->we can directly give SET NAME inside()
		//System.out.println(list);
		for(int i=0;i<list.size()-1;i++)
		{
			int  before=((list.get(i))+1);
			int after=list.get(i+1);
			//System.out.println(after);
			//System.out.println(before);
			if(before!=after) {
				System.out.println("The Missing Element is: " +before);
			}
				
		}
	}

}
