package web_simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Actions {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\ABrowser driver\\chromedriver.exe");
		
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.saucedemo.com/");
				driver.manage().window().maximize();
				driver.findElement(By.name("user-name")).sendKeys("standard_user");
				driver.findElement(By.name("password")).sendKeys("secret_sauce");
				driver.findElement(By.name("login-button")).click();
				 WebElement element =driver.findElement(By.xpath("react-burger-menu-btn"));
				 Actions actions = new Actions(driver);
				 actions.moveToElement(element).build().perform();
				 Thread.sleep(4000);
				 driver.findElement(By.xpath("logout_sidebar_link")).click();
				 Thread.sleep(4000);
				 System.out.println("clicl on submenu");
				driver.quit();

	}

}
