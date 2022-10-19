package _101Reporters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images_101 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dev.101reporters.com");
		
		driver.manage().window().maximize();
		List<WebElement> listwebele = driver.findElements(By.className("img-responsive"));
			int i=0;
			for (WebElement element: listwebele) {
				i= i+1;
				System.out.println(element.getTagName());
				System.out.println(element.getText());
				
				String link = element.getAttribute("alt");
				System.out.println(link);
				
			}
			System.out.println("Total object found" + i);
	}

}
