package SampleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick_and_sucessmsg {

	public static void main(String[] args) throws InterruptedException {
		// Create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to a web page
        driver.get("http://omayo.blogspot.com/#");

        // Locate the element you want to double-click by its selector (e.g., XPath, CSS selector, etc.)
        WebElement elementToDoubleClick = driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
        // Create an Actions object and double-click the element
        Actions actions = new Actions(driver);
        actions.doubleClick(elementToDoubleClick).perform();
        Thread.sleep(10000);
        
        //validate message
        

        // Close the browser
        driver.quit();
	}
	public static void scrollDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll down by 500 pixels
		js.executeScript("window.scrollBy(0, 500);");
	}
}