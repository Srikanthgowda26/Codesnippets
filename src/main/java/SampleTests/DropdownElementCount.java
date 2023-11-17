package SampleTests;

import java.util.List;

//import org.junit.Assert;
//public class dropdowncount {
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropdownElementCount {
	public static void main(String[] args) {
		// Set the path to the ChromeDriver executable
		//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
		// Initialize the ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Navigate to the webpage
		driver.get("https://the-internet.herokuapp.com/dropdown"); // Replace with your webpage URL
		//Title of the page
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
		// Locate the dropdown element by its selector
		WebElement dropdown = driver.findElement(By.id("dropdown")); // Replace with your actual selector

		// Click the dropdown to open it
		dropdown.click();

		// Locate all the dropdown options and get their count
		int dropdownOptionsCount = driver.findElements(By.xpath("//*[@id='dropdown']/option")).size();

		// Print the count to the console
		System.out.println("Dropdown Element Count: " + dropdownOptionsCount);

		// You can perform assertions or further actions with the count here
		List<WebElement> dropdownOptionsCount1 = driver.findElements(By.xpath("//*[@id='dropdown']/option"));
		int expectedCount = 3; // Replace with the expected count
		// Assert that the actual count matches the expected count
		Assert.assertEquals(expectedCount, dropdownOptionsCount1.size());
		System.out.println("Assetion PASSED: " + "Expected values " + expectedCount + " Found values " + dropdownOptionsCount1.size() );
		for (WebElement option : dropdownOptionsCount1) {
			System.out.println("Dropdown Option Value: " + option.getText());
		}
		//Validating the count
		// Close the browser
		driver.quit();
	}
}
