package web_simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class Demo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("enter  url");
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.id("navbarDropdown")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("dropdown-item")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/main/div[1]/div/div[2]/div/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/header/nav/div/div/span/input")).sendKeys("selenium");
		Thread.sleep(3000);
		
	     driver.quit();
		
	
		
		

	}

}