package SampleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test11 {
	public static void main(String[] args) throws InterruptedException {
		
		// Create ChromeOptions and enable incognito mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        // Create a ChromeDriver instance with the options
        WebDriver driver = new ChromeDriver(options);

		/* Initialize the ChromeDriver
		WebDriver driver = new ChromeDriver();*/
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		// Get the title of the page
		String title = driver.getTitle();
		// Print the title of the page
		System.out.println("The title of the page is: " + title);
		driver.switchTo().frame(0);
		//WebElement searchelement = driver.findElement(By.xpath("//input[@type='text']//ancestor::div[@id='b-query-box']"));
		WebElement searchelement1 = driver.findElement(By.xpath("//input[@id='b-query']"));
		searchelement1.click();
		Thread.sleep(5*1000);
		searchelement1.sendKeys("hiii");
		Thread.sleep(5*1000);
		driver.switchTo().defaultContent();
		WebElement searchelement2 = driver.findElement(By.xpath("//a[@id='link1']"));
		searchelement2.click();
		Thread.sleep(5*1000);
		driver.quit();
	}}
