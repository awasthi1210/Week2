package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnListbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriverManager.chromedriver().setup();
  ChromeDriver driver = new ChromeDriver();
  driver.get("http://www.leafground.com/pages/Dropdown.html");
  new Select( driver.findElement(By.id("dropdown1"))).selectByIndex(2);
  new Select(driver.findElement(By.name("dropdown2"))).selectByVisibleText("UFT/QTP");
  new Select(driver.findElement(By.id("dropdown3"))).selectByValue("1");
  System.out.println(new Select(driver.findElement(By.className("dropdown"))).getOptions().size());
  driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Selenium");
  WebElement element = driver.findElement(By.xpath("(//div[@class ='example']/select)[6]"));
  Select dd = new Select(element);
  dd.selectByIndex(1);
 
	}

}
