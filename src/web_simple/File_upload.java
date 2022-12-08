package web_simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload {

	public static void main(String[] args) throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\ABrowser driver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://youtu.be/M4Ye3SKT46g");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.quit();

	}

}
