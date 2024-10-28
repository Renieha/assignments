package week3.day1;


public class  mainclass {
 public static void main(String[] args) {
    
     TestData testData = new TestData();
     testData.enterCredentials();
     testData.navigateToHomePage();

     System.out.println();
     LoginTestData loginTestData = new LoginTestData();
     loginTestData.enterCredentials();       
     loginTestData.navigateToHomePage();    
     loginTestData.enterUsername("renisha"); 
     loginTestData.enterPassword("reni43"); 
}
