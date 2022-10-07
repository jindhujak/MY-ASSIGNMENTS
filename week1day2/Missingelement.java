package week1day2;

import java.util.Arrays;

public class Missingelement {
	
	public static void main(String[] args) {
		int[] n= {5,6,2,3,1,8,9,0};
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
		
		for(int i=0;i<n.length;i++)
			if(n[i]!=(i))
			{
				System.out.println(i);
				break;
			}
	}

}
