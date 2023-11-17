package SampleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_till_element_visible {

	public static void main(String[] args) throws InterruptedException {
			// Create a new instance of the WebDriver
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			// Navigate to a webpage with frames
			driver.get("https://omayo.blogspot.com/");
			// Locate the element you want to scroll to
	        WebElement element = driver.findElement(By.xpath("//button[text()='Dropdown']//parent::div"));
	        String elementtext = element.getText();
	        
	        System.out.println(elementtext);
	        
	        

	        // Create a JavaScriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll to the element
	        js.executeScript("arguments[0].scrollIntoView(true);", element);
	        
	        element.click();
	        Thread.sleep(5000);
	        WebElement element1=driver.findElement(By.xpath("//a[text()='Facebook']"));
	        //element1.click();
	        String elementtext2= element1.getText();
	        System.out.println("Expected Text: "+elementtext2+" Displayed");
	        
	        
	        //close browser
	        driver.quit();
			
	}

}
