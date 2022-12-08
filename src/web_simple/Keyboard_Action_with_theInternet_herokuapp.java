package web_simple;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Action_with_theInternet_herokuapp {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\ABrowser driver\\chromedriver.exe"); // launching the browser
		WebDriver driver= new ChromeDriver();
		// here we are use the website is the internet herokuapp for single  key press
		driver.get("https://the-internet.herokuapp.com/key_presses"); // get url
		Actions actions = new Actions(driver);// creat object Actions
		
		actions.sendKeys(Keys.ENTER).perform(); //actions method for key entering
		Thread.sleep(3000); // for give some 3 second [Thread.sleep(3000)-3000 is in millisecond that is 3 second])
		actions.sendKeys(Keys.CLEAR).perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.ADD).perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.F7).perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.NUMPAD0).perform();
		actions.sendKeys(Keys.CANCEL).perform();
		actions.sendKeys(Keys.BACK_SPACE).perform();
		actions.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.ZENKAKU_HANKAKU).perform();// zenkaku and hankaku is japani keys its meaning is hankaku(half-width) and zenkaku(full-width)
		Thread.sleep(3000);
		actions.sendKeys(Keys.SUBTRACT).perform();
		Thread.sleep(3000);// using this action and Keys object u can able to press all key 
		driver.quit();
		
		
		

	}

}
