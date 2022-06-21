package day2;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.navigate().back();
		
		String image = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("src");
		HttpURLConnection img= (HttpURLConnection)new URL(image).openConnection();
		if(img.getResponseCode()>400) {
			System.out.println("Image  " +image+"  is broken with response code "+ img.getResponseCode());
		}
		else {
			System.out.println("Image is no broken");
		}
		
		
		// Need to modify this mouse click
	 driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();

		
	}

}
