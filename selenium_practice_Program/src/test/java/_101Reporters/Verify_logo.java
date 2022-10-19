package _101Reporters;

import org.openqa.selenium.By;                               //   //img[@alt='logo']   
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;                      //    //img[@alt='//']
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;

public class Verify_logo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String url = "https://dev.101reporters.com/";
		driver.get(url);
		// identify image
		WebElement i = driver.findElement(By.xpath("//img[@alt='logo']"));
		// Javascript executor to check image
		Boolean p = (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

		// verify if status is true
		if (p) {
			System.out.println("Logo present");
		} else {
			System.out.println("Logo not present");
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
