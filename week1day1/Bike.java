package week1day1;
import week1day1.Car;

public class Bike {
	public void vehicleName(String name) {
		System.out.println("Name= " +name);
	}
	public void fuelLevel(boolean level) {
		System.out.println("Fuel level is full= " +level);
	}
public static void main(String[] args) {
	Bike d=new Bike();
Car c=new Car();
	System.out.println("Bike Details: ");
    d.vehicleName("Hero Honda");
    c.applyBreak("Break not applied");
    c.soundHorn("Horn not sounded");
    d.fuelLevel(true);
}
}
