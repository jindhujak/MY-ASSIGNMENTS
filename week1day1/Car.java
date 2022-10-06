package week1day1;
import week1day1.Bike;

public class Car {
	public void applyBreak(String status) {
		
System.out.println("Break Status= " +status);
	}
	public void soundHorn(String hstatus) {
		System.out.println("Horn status= " +hstatus);
	}
public static void main(String[] args) {
	Car c=new Car();
	Bike d=new Bike();
	System.out.println("Car Details:");
	d.vehicleName("BMW");
	c.applyBreak("Break Applied");
	c.soundHorn("Horn sounded");
	d.fuelLevel(false);

}
	
	
}
