package SampleTests;

import org.openqa.selenium.By;
//import org.junit.Assert;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class basicaAuth {

	public static void main(String[] args) {
		// Initialize the ChromeDriver drive dri
        WebDriver driver = new ChromeDriver();

        String urlWithAuth = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
        driver.get(urlWithAuth);

        // Send the username and password using WebDriver's switchTo().alert()
        //driver.switchTo().alert().sendKeys("admin" + Keys.TAB + "admin" + Keys.ENTER);
      //Find the element containing the text you want to verify
        WebElement textElement = driver.findElement(By.xpath("//*[text()='Basic Auth']"));
     // Get the text from the element
        String elementText = textElement.getText();
        // Print the text to the console
        System.out.println("Text from the element: " + elementText);
        // Verify if the text is displayed
        Assert.assertTrue(textElement.isDisplayed());
     // Verify if the actual text equals the expected text
        // Define the expected text
        String expectedText = "Basic Auth";
       Assert.assertEquals(elementText, expectedText);
        System.out.println("Assertion passed");
        // Close the WebDriver
        driver.quit();


	}

}
