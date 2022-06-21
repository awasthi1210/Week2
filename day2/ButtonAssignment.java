package day2;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");

//Go to the Home page
		driver.findElement(By.xpath("//button[@id='home']")).click();

//Navigate back
		driver.navigate().back();

//Get Position
System.out.println(driver.findElement(By.xpath("//button[@id='position']")).getLocation().getX());
System.out.println(driver.findElement(By.xpath("//button[@id='position']")).getLocation().getY());

//get background Color
		System.out.println(driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color"));

//Get the Height and width of the button
		System.out.println(driver.findElement(By.xpath("//button[@id='size']")).getSize().getHeight());
		System.out.println(driver.findElement(By.xpath("//button[@id='size']")).getSize().getWidth());

	}

}
