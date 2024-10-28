package week3.day1;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("Open Incognito");
	}
	public void clearCache() {
		System.out.println("Clear the cache");
		
	}
	public static void main(String[] args) {
		Chrome chr = new Chrome();
		chr.openIncognito();
		chr.clearCache();
		chr.navigateBack();
		chr.closeBrowser();
		
		
	}

}