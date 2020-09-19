package com.edureka.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	  static WebDriver driver= null;
	public static void main(String[] args) {
    
		System.setProperty("webdriver.chrome.driver", "E:\\selenium workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//WebElement name = driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover')]"));
		
		//WebElement name = driver.findElement(By.id("email"));
		
		//WebElement name =driver.findElement(By.xpath("//a[text()='Forgotten account?']"));

		//WebElement name =driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]"));
		
		//WebElement name =driver.findElement(By.xpath("//a[starts-with(text(),'Forgotten')]"));
		
		//WebElement name =driver.findElement(By.xpath("//a[starts-with(@href,'https://www.facebook.com/recover')]"));
		
		WebElement day =driver.findElement(By.xpath("//select[@id='day']/option[2]"));
		day.click();
		
		WebElement month =driver.findElement(By.xpath("//select[@id='day']/following-sibling::select/option[2]"));
		
		month .click();
		
		WebElement year =driver.findElement(By.xpath("//select[@id='month']/following::option[2]"));
		
		year.click();
		//driver.close();
	

	}

}	
