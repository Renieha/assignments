package week3.day2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver(); //Launch the browser
		
		driver.get("http://leaftaps.com/opentaps/"); //Load the url

		driver.manage().window().maximize();  // maximize the window

		WebElement usernameField = driver.findElement(By.id("username")); // Locate the Element 'username' 
		
		usernameField.sendKeys("demosalesmanager"); // enter the username

		WebElement passwordField = driver.findElement(By.id("password")); // Locate the password element
		
		passwordField.sendKeys("crmsfa"); // enter the password

		driver.findElement(By.className("decorativeSubmit")).click(); // Locate and click the Login button 
		
		driver.findElement(By.linkText("CRM/SFA")).click(); // Locate and click the CRM/SFA link 

		driver.findElement(By.linkText("Leads")).click();  //click on Leads tab
		
		driver.findElement(By.linkText("Create Lead")).click();  //click on Create Lead button
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sangameswari"); //Enter the Firstname
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raja"); //Enter the Lastname
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf"); //Enter the Company name
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Trainee"); //Enter the Title
		
		driver.findElement(By.className("smallSubmit")).click(); //click the createlead button
				
		String Title = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();//locate the Title and print it
		System.out.println(Title);
		
		driver.close(); // Close the browser

	}

}