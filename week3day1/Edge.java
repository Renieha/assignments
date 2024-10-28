package week3.day1;

public class Edge extends Browser  {
	public void takesnap() {
	System.out.println("Take the Snap");
}
	public void clearCookies() {
		System.out.println("Cookies cleared");
		}

	public static void main(String[] args) {
		Edge ed = new Edge();
		ed.takesnap();
		ed.clearCookies();
		ed.openURL();
		ed.closeBrowser();
		ed.navigateBack();
		
		
	}

}