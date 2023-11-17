package SampleTests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class getUrl{
    public static void main(String[] args) {
        // Create a new WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Navigate to a web page
        driver.get("https://www.google.com");
        // Get the URL of the current page
        String url = driver.getCurrentUrl();
        // Print the URL to the console
        System.out.println(url);
        // Close the WebDriver instance
        driver.quit();
    }
}

 