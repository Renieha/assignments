package week3.day1;

//MainClass.java
public class  mainclass {
 public static void main(String[] args) {
     // Creating an object of the superclass TestData
     TestData testData = new TestData();
     testData.enterCredentials();
     testData.navigateToHomePage();

     System.out.println(); // For better readability

     // Creating an object of the subclass LoginTestData
     LoginTestData loginTestData = new LoginTestData();
     loginTestData.enterCredentials();       // Inherited method
     loginTestData.navigateToHomePage();     // Inherited method
     loginTestData.enterUsername("user123"); // Subclass method
     loginTestData.enterPassword("pass123"); // Subclass method
 }
}
