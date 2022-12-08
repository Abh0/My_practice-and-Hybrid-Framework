package web_simple;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Demo_from_HYRtuto {

	public static void main(String[] args) throws Exception {
	     System.setProperty("webdriver.chrome.driver", "C:\\ABrowser driver\\chromedriver.exe"); // access driver
	     WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.hyrtutorials.com/p/alertsdemo.html"); //get url
	     
	     // simple Alert
	       driver.findElement(By.id("alertBox")).click();// id of click me for simple alert
	       Alert simpleAlert = driver.switchTo().alert(); //  using this direct switch to alert or pop up box
	       System.out.println(simpleAlert.getText());
	       Thread.sleep(5000);
	       simpleAlert.accept();
	       
	       Thread.sleep(8000);
	       driver.quit();
	     
	     

	}

}
