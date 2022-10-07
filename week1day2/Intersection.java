package week1day2;

public class Intersection {
 
	public static void main(String[] args) {
		int[] arr1= {3,6,4,8,0,1};
		int[] arr2= {9,0,3,2,6,11};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
		}
	}
}
