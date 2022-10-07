package week1day2;

import java.util.Arrays;

public class Secondsmallest {
	public static void main(String[] args) {
		int[] n= {23,45,67,32,89,22};
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
		System.out.println("The second smallest number = " +n[1]);
	}

}
