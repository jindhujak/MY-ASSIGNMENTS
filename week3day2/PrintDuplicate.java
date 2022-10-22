package week3day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicate {
	public static void main(String[] args) {


		/*
		 * Problem Statement : Print only duplicate values
		 * Expected output: 4 and 8
		 * 
		 * How to solve?
		 * 1) Regular for loop
		 * 2) Using Set
		 * 
		 * Using Set 
		 * 
		 * a) Add every element into Set
		 * b) If it is already there in the Set -> Print duplicate
		 * 
		 */
	//USING NORMAL ARRAY METHOD AND FOR LOOP
		//int[] data= {4,3,6,8,29,1,2,4,7,8};
		//		Arrays.sort(data);
		//		for(int i=0;i<data.length-1;i++)
		//		{
		//			if(data[i]==data[i+1]) {
		//			System.out.println("The duplicate number is : " +data[i+1]);
		//			}
		//
		//		}
		//System.out.println(Arrays.toString(data));
		Integer[] data = {4,3,6,8,29,1,2,4,7,8};

		Set<Integer> input= new LinkedHashSet<Integer>();
		
	//USING FOR LOOP IN SET
//		for(int i=0;i<data.length;i++)
//		{
//			boolean duplicate= input.add(data[i]);
//			if(duplicate==false)
//				System.out.println("The duplicates values are: "+data[i]);
//		}
		
	//USING FOR EACH LOOP IN SET
		for(Integer i:data)
		{
			boolean duplicate= input.add(i);
			if(duplicate==false)
				System.out.println("The duplicated value is : " +i);
		}

		

	}}

