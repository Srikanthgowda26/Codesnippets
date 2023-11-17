package SampleTests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class scrollExample {
	public static void main(String[] args) throws InterruptedException {
		// Set the path to the ChromeDriver executable
		//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

		// Create a Chrome WebDriver instance
		//ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Navigate to a web page
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(20*1000);
		//       String url = driver.getCurrentUrl();
		//       System.out.println(url);
		//       System.out.println("Hi");

		// Perform the scroll
		scrollDown(driver);

		// Close the WebDriver
		driver.quit();
	}

	public static void scrollDown(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll down by 500 pixels Downwards
		js.executeScript("window.scrollBy(0, 500);");
		//Thread.sleep(5000);
		
		// Scroll to the right by a specified number of pixels
        /*int scrollByPixels = 500; // You can adjust this value as needed
        js.executeScript("window.scrollBy(" + scrollByPixels + ", 0);");*/

	}}

