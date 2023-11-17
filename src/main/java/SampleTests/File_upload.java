package SampleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload {

	public static void main(String[] args) throws InterruptedException {
		 // Create a new instance of the ChromeDriver.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the web page with the file upload form.
        driver.get("https://omayo.blogspot.com/");

        // Find the file input element.
        WebElement fileInput = driver.findElement(By.xpath("//input[@id='uploadfile']"));
        
        // Create a JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to the element
        js.executeScript("arguments[0].scrollIntoView(true);", fileInput);
        
        //element.click();
        Thread.sleep(5000);

        // Specify the file path you want to upload.
        fileInput.sendKeys("D:/Testingfiles/DL Services Stage Details.pdf");

        // Submit the form or perform any other necessary actions.
        Thread.sleep(10000);

        // Close the browser.
        driver.quit();
    }
}
//Make sure to replace "path/to/chromedriver.exe" with the actual path to the ChromeDriver executable on your system and adjust the web page URL, element locator method, and file path as needed for your specific use case.






