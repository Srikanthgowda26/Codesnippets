package SampleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		WebElement elementToVerify = driver.findElement(By.xpath("(//*[text()='Log in'])[1]"));
		if (elementToVerify.isDisplayed()) {
			System.out.println("Element is displayed on the page.");
		} else {
			System.out.println("Element is not displayed on the page.");
		}
		Thread.sleep(3000);
		System.out.println("slepping loaded succefully");
		Thread.sleep(3000);
		driver.quit();
	}
}
