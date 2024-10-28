package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver(); //Launch the browser
		
		driver.get("http://leaftaps.com/opentaps/"); //Load the url
		
		driver.manage().window().maximize();  // maximize the window
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager"); // Locate and enter 'username' 
		
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // Locate and enter the password 
		
		driver.findElement(By.className("decorativeSubmit")).click(); // Locate and click the Login button 
		
		driver.findElement(By.linkText("CRM/SFA")).click(); // Locate and click the CRM/SFA link 

		driver.findElement(By.linkText("Accounts")).click(); // Locate and click Accounts tab
		
		driver.findElement(By.linkText("Create Account")).click(); //click on Create Account
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Testleaf10342"); //locate and enter AccountName
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester"); //enter the given Description
		
		driver.findElement(By.id("numberEmployees")).sendKeys("10"); // enter a no of employees
		
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps"); //enter a site name
		
		driver.findElement(By.className("smallSubmit")).click(); //click the CreateAccount button
		
		String Title = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")) .getText(); //locate the title and print it
		System.out.println("The Account Name is "+Title);
		
		driver.close();
		
	}

}
