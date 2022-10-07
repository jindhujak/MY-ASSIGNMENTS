package week1day2;

public class Fibonacciseries {
	
	public static void main(String[] args) {
	
		int n=10;
		  int n1=0,n2=1,next=1; 
		  System.out.println(n1); 
		  System.out.println(n2); 
		  for(int i=3;i<=n;i++)
		  { System.out.println(next);
			  n1=n2;
			  n2=next;
			  next=n1+n2;
		 
		 
			  }
	}

}
