package web_simple;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions_for_multiple_keypress_using_TestCompare {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\ABrowser driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// https://text-compare.com/ this is for press multiple key like ctrl+c, ctrl+a
		// , ctrl+v , ctrl+z.
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize(); // this command for maximize the window
		// inspect input BOX1 and input box2 using xpath take format as
		// //tagname[@attributeType='attributeValue']
		WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		input1.sendKeys("welcome to my selenium and its very interesting to learn . i am enjoy");
		Actions actions = new Actions(driver);
		// now perform activity press (ctrl+a) for select all text from input box 1
		// and following statment is for press ctrl+a keyboard activity
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.perform();
		// now we perform ctrl+c
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
		actions.perform();
		// now press TAB for shifting the text from input1 to input2
		actions.sendKeys(Keys.TAB);
		actions.perform();
		// now we perform ctrl+v
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		actions.perform();
		// now for compare input1 to input2
		if (input1.getAttribute("value").equals(input2.getAttribute("value")))
			System.out.println("text copy ok and matched");
		else
			System.out.println("text not copy and not matched");
		driver.quit();
	}

}
