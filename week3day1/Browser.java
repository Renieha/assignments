package week3.day1;

public class Browser {
String browserName = "Chrome";
float browserVersion = 3.0f;
	public void openURL() {
		System.out.println("The URL is opened");
	}
	public void closeBrowser() {
		System.out.println("The Browser is closed");
	}
	public void navigateBack()
	{
		System.out.println("The Browser has been navigated back");
	}
	public static void main(String[] args) {
		Browser basicBrowser = new Browser();
		basicBrowser.openURL();
		basicBrowser.closeBrowser();
		basicBrowser.navigateBack();
	}
}
		