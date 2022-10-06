package week1day1;

public class Mobile {

	public void makeCall(String mobilemodel , float mobileweight) {
		//String mobilemodel="Samsung Galaxy";
		//float mobileweight =1.2f;
		System.out.println("Mobile Model= " +mobilemodel);
		System.out.println("Mobile Weight= " +mobileweight);
	}
	public void sendMsg(boolean fullcharged, int mobilecost) {
		//boolean fullcharged= true;
		//int mobilecost=38000;
		System.out.println("Full Charged= " +fullcharged);
		System.out.println("Mobile Cost= " +mobilecost);
		
	}
	public static void main(String[] args) {
	
		Mobile A= new Mobile();
		System.out.println("This is MY MOBILE:");
		A.makeCall("Samsung Galaxy",1.2f);
		A.sendMsg(true,38000);
	}
}
