package _101Reporters;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Links_101 {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver.exe");
		
				

		String homepage = "https://dev.101reporters.com" ;
		String url = "https://dev.101reporters.com/" ;
		HttpsURLConnection huc = null; 
		int respcode = 200; 
		WebDriver driver = new ChromeDriver();

		driver.get(homepage);
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = links.iterator();
		while (it.hasNext()) {
			url= it.next().getAttribute("href");
			System.out.println(url);
			
			if (url == null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
				
			}
			if(!url.startsWith(homepage)){
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}
			try {
				huc= (HttpsURLConnection) (new URL(url).openConnection());
				
				huc.setRequestMethod("HEAD");
				huc.connect();
				respcode=huc.getResponseCode();
				 
				
				if(respcode>= 400) {
					
					System.out.println(url +" is a broken link");
				}
				else {
					System.out.println(url+" is a valid link");
					
				}
				
			} catch (MalformedURLException  e) {
				e.printStackTrace();
			}
				catch(IOException e) {
					e.printStackTrace();
					
					
				}
				
			}
			
		
		driver.quit();
		}
	}


