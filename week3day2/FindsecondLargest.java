package week3day2;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindsecondLargest {
	public static void main(String[] args) {
		
				Integer[]data={3,2,11,4,6,7,2,3,3,6,7};
				Set<Integer>out=new TreeSet<Integer>();
				for(int i=0;i<data.length;i++)
				{
					out.add(data[i]);
				}
				System.out.println(out);
				//List list=new ArrayList(Arrays.asList(out)); because we can't give SET inside LIST directly inside as Arrays.asList(out));have to iterate through for loop only
				List<Integer> list=new ArrayList<Integer>();
				for(Integer i:out)
				list.add(i);
				System.out.println(list);
				int length=list.size();
				//System.out.println(length);
				
			System.out.println("The Second largest number is : " +list.get(list.size()-2));
				
			 
				

				/*
				 * Pseudo Code: 
				 * a) Create a empty Set Using TreeSet
				 * b) Declare for loop iterator from 0 to data.length and add into Set 
				 * c) converted Set into List
				 * d) Print the second last element from List
				 * 
				 * 
				 */
                
				//Set s=new TreeSet (Array.);
                
	}

}
