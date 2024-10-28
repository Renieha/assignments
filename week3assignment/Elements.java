package week3assignment;


public class Elements {
 public static void main(String[] args) {
    
     WebElement webElement = new WebElement();
     webElement.click();
     webElement.setText("Hello World");

     System.out.println(); 
     Button button = new Button();
     button.click();       
     button.submit();     

     System.out.println(); 
     TextField textField = new TextField();
     textField.click();            
     textField.setText("Username"); 
     System.out.println(textField.getText()); 

     System.out.println();

     // Creating an object of CheckBoxButton
     CheckBoxButton checkBoxButton = new CheckBoxButton();
     checkBoxButton.click();         
     checkBoxButton.submit();          
     checkBoxButton.clickCheckButton(); 
     System.out.println();

     
     RadioButton radioButton = new RadioButton();
     radioButton.click();           
     radioButton.submit();          
     radioButton.selectRadioButton();
 }
}
