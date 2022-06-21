package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkwithEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriverManager.chromedriver().setup();
 ChromeDriver driver = new ChromeDriver();
 driver.get("http://www.leafground.com/pages/Edit.html");
 driver.findElement(By.id("email")).sendKeys("monaparashar1229@gmail.com");
  driver.findElement(By.xpath("(//input)[2]")).sendKeys("Mona");
  driver.findElement(By.xpath("(//input)[2]")).sendKeys(Keys.TAB);
  
  String text = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("Value");
  System.out.println(text);
  
  driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
  
  System.out.println(driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled());
	}

}
