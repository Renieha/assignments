package week3.day1;

import java.util.List;
import  java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLink {
	
	public static void main(String[] args) throws  InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		Thread.sleep(4000);
		List<WebElement>allLink = driver.findElements(By.tagName("a"));
		List<String>allLinkText = new ArrayList<String>();
		
		for(WebElement element: allLink) {
			String text = element.getText();
			allLinkText.add(text);
		}
		System.out.println(allLinkText);
		
	}
}