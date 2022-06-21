package day2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		//Go to the Home page
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		
		// Where am I suppose to go
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?"))
				.getAttribute("href"));

		// Verify am I broken
		String attribute = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
		HttpURLConnection huc = null;
		huc = (HttpURLConnection) new URL(attribute).openConnection();
		if (huc.getResponseCode() >= 400) {
			System.out.println("the url  " + attribute + " is broken" + " with status = " + huc.getResponseCode());
		} else 
		{
			System.out.println("the url  " + attribute + " is not broken");
			
		}

		// Find the count of links
		System.out.println(driver.findElements(By.tagName("a")).size());
		driver.close();

	}

}
