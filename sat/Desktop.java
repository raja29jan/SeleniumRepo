package week3.day1.sat;

import org.system.Desktop;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop Size is 12");
	}
	
	public static void main(String[] args) {
		Desktop a=new Desktop();
		a.computerModel();
		a.desktopSize();
	}
}
