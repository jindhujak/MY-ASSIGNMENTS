package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("Screen size is: 39.6 cm (15.6)");
	}
	
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.computerModel();
		d.desktopSize();
		
	}
}
