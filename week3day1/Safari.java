package week3.day1;

public class Safari extends Browser {
	public void readerMode() {
		System.out.println("The Reader mode is ON");
	}
	public void fullScreenMode() {
		System.out.println("Full screenmode is ON");
	}
	public static void main(String[] args) {
		Safari Saf = new Safari();
		Saf.readerMode();
		Saf.fullScreenMode();
		Saf.openURL();
		Saf.closeBrowser();
	}
}