package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver = new ChromeDriver(); 
		//Load the url
		driver.get("https://en-gb.facebook.com/");
		// maximize the window
		driver.manage().window().maximize(); 
		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the Create new account button
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		//locate and enter first name field
		driver.findElement(By.name("firstname")).sendKeys("renisha");
		//enter lastname field
		driver.findElement(By.name("lastname")).sendKeys("rajendran");
		//enter email id
		driver.findElement(By.name("reg_email__")).sendKeys("renisha20043@gmail.com");
		//enter New password
		driver.findElement(By.name("reg_passwd__")).sendKeys("reni43");
		
		//locate the dropdown element inthe date field
		WebElement dateWE = driver.findElement(By.xpath("//select[@id='day']"));
		//create object for Select and pass WebElement 
		Select dateDD = new Select(dateWE);
		//select the value
		dateDD.selectByIndex(8);
		//locate and select the value in the month dropdown field
		WebElement monthWE = driver.findElement(By.name("birthday_month"));
		Select monthDD = new Select(monthWE);
		monthDD.selectByIndex(2);
		// locate and select the value in the year dropdown field
		WebElement yearWE = driver.findElement(By.name("birthday_year"));
		Select yearDD =new Select(yearWE);
		yearDD.selectByIndex(60);
		//locate and click female
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		//(or) 
		//driver.findElement(By.xpath("//input[@class='_8esa'])[1]")).click();
	}

}
