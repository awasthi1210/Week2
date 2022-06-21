package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://www.leafground.com/pages/radio.html");
driver.findElement(By.id("yes")).click();
System.out.println(driver.findElement(By.xpath("(//input[@value='1'])[2]")).isSelected());
	}

}
