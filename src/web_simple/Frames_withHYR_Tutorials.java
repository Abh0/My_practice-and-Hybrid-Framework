package web_simple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames_withHYR_Tutorials {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\ABrowser driver\\chromedriver.exe");
		//WebDriver.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(5000);
		
		driver.findElement(By.id("name")).sendKeys("Hello");// main frame text box enter Hello
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.id("frm3")));// switch frame 1
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		
		Select courseDD = new Select(driver.findElement(By.id("course")));//enter on course btn on frame1
		Thread.sleep(5000);
		courseDD.selectByVisibleText("Python");// (course)select the course name out of 5 course name which java, python ,dot net
		Thread.sleep(5000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("frame3");
		driver.switchTo().defaultContent();// again switch to main frame
		driver.findElement(By.id("name")).sendKeys("World");// and again enter <World> in main frame text box
		//now go to the nested frame and enter 
		driver.quit();
		

	}

}
