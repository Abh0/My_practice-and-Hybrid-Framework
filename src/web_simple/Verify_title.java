package web_simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Verify_title {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Browser driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		// title verification
		if (driver.getTitle().equals("Swag Llabs")){
		System.out.println("title matched");
	}
	
	else {
		System.out.println("title not matched");
	}
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		
		Thread.sleep(5000);
		System.out.println("login completed");
		//mouse over
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button]"))).perform();
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")).click();
		
		driver.quit();
	
	
		

	}}

