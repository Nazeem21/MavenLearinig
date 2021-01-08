package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {
 static WebDriver driver;
 public static void main(String[] args) {
	 System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\user\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
    driver.get("http://www.google.com");
    driver.findElement(By.name("q")).sendKeys("Whatsup Duck!");
    driver.findElement(By.name("q")).submit();
    driver.quit();
 } 
}
