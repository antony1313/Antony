package org.grnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Antony\\Google\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement txtuser = driver.findElement(By.name("q"));
		txtuser.sendKeys("Greens Technologhy");
		
	}
}
	
	

