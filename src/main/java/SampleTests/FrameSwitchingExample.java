package SampleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwitchingExample {
	public static void main(String[] args) {
		// Set the path to the ChromeDriver executable
		//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

		// Create a new instance of the WebDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Navigate to a webpage with frames
		driver.get("https://the-internet.herokuapp.com/iframe");

		// method 1 Switch to a frame by index (0-based index)
		driver.switchTo().frame(0);
		/*method 2
	        WebElement framet = driver.findElement(By.id("mce_0_ifr"));
	        driver.switchTo().frame(framet);*/
		// Perform actions within the frame
		// For example, clicking an element within the frame
		WebElement frameElement = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
		//frameElement.clear();
		//WebElement frameElement1 = driver.findElement(By.xpath("//body//p"));
		frameElement.sendKeys("HII");
		//frameElement.sendKeys("HII");
		// Print the updated text
		String updatedText = frameElement.getText();
		//String updatedText = updatedText;
		System.out.println("Updated Text: " + updatedText);

		// After performing actions in the frame, switch back to the main/default content
		driver.switchTo().defaultContent();
		//Validating secondary text
		WebElement frameElement2 = driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
		String messageText1 = frameElement2.getText();
		System.out.println(messageText1);

		// You can switch to another frame by index or other attributes as needed
		// For example, switch to a frame by its name or ID
		// driver.switchTo().frame("frameName"); // by name
		// driver.switchTo().frame("frameID");     // by ID

		// Close the WebDriver
		driver.quit();
	}
}
