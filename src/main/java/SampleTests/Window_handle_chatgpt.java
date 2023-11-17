package SampleTests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle_chatgpt {
	//private static Object secondWindowHandle;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		// Get the current URL
		String currentURL = driver.getCurrentUrl();

		// Get the page title
		String pageTitle = driver.getTitle();

		// Print the URL and title to the console
		System.out.println("Current URL: " + currentURL);
		System.out.println("Page Title: " + pageTitle);

		String firstWindowHandle = driver.getWindowHandle();
		System.out.println("in original window");
		// Open the first new window

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String windowHandle : allWindowHandles) {
			if (!windowHandle.equals(firstWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		// Perform actions in the first new window
		driver.findElement(By.xpath("//a[normalize-space()='Open a popup window']")).click();
		System.out.println("in first window");

		// Open the second new window
		allWindowHandles = driver.getWindowHandles();

		String secondWindowHandle = null;

		for (String windowHandle : allWindowHandles) {
			if (!windowHandle.equals(firstWindowHandle)) {
				secondWindowHandle = windowHandle;
				driver.switchTo().window(secondWindowHandle);
				break;
			}
		}

		// Perform actions in the second new window
		WebElement element2= driver.findElement(By.xpath("//h2[normalize-space()='404 Not found']"));
		String element3 = element2.getText();
		System.out.println("in the second window found the text : " + element3);
		
		// Switch back to the original window
		// Perform actions in the original window
		driver.switchTo().window(firstWindowHandle);
		WebElement outcome = driver.findElement(By.xpath("//h1[@class='title']"));
		String resultlast =outcome.getText();
		System.out.println(resultlast);
		System.out.println("in original window");
		
		//calling again second window
		driver.switchTo().window(secondWindowHandle);
		WebElement extratime = driver.findElement(By.xpath("//h2[normalize-space()='404 Not found']"));
		String outcome2 = extratime.getText();
		System.out.println("2time calling the window 2 trial fount text=" +  outcome2);
		driver.switchTo().window(firstWindowHandle);
		
		// Close all windows and quit the driver
		driver.quit();

	}
}
