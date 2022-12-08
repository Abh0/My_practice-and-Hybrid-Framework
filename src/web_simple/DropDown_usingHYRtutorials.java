package web_simple;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_usingHYRtutorials {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\ABrowser driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		WebElement courseNameElement = driver.findElement(By.id("course"));
		Select courseName_DD = new Select(courseNameElement);
		// single selection
		// courseName_DD.selectByIndex(1);// java

		// courseName_DD.selectByValue("net");// .net

		// courseName_DD.selectByValue("python");// python

		// for multiple selection
		// WebElement ideNameElement = driver.findElement(By.id("ide"));
		// Select ideName_DD = new Select(ideNameElement);
		// ideName_DD.selectByIndex(0);

		// ideName_DD.selectByValue("ij");

		// ideName_DD.selectByValue("nb");

		// ideName_DD.deselectByIndex(0);
		// ideName_DD.deselectByValue("ij");
		// ideName_DD.deselectByValue("nb");

		List<WebElement> coursesAvailable = courseName_DD.getOptions();
		System.out.println("coursesAvailable::");
		for (WebElement webElement : coursesAvailable) {
			
		}
		System.out.println();

	}
}
