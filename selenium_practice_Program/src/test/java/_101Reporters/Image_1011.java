package _101Reporters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Image_1011 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dev.101reporters.com");
		
		driver.manage().window().maximize();
	
		List<WebElement> listImages = driver.findElements(By.tagName("img"));
		
		System.out.println("No. of Images: " + listImages.size());

		Thread.sleep(3000);
		
		driver.quit();
	}
	

}
