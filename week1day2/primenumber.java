package week1day2;

public class primenumber {

	public static void main(String[] args) {
		 int x=24,i;
		 boolean z=false;
		 
		 for(i=2;i<x;i++) {
			 
			 if(x%i==0) {
				 z = true;
			 break;
			 }
		 }
		 System.out.println(z);
			
		if(z==true) 
		 System.out.println(x+ " is not a Prime number");
		else 
			System.out.println(x+ " is a prime number");
	 
				 
}
	}
	
