package com.edureka.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehandling {
      
	static WebDriver driver = null;
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.HOURS);
		
		//driver.switchTo().frame(frame);
		
		WebElement innerframe = driver.findElement(By.xpath("//a[@href='#Multiple']"));
		innerframe.click();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));

	
		
		driver.switchTo().frame(frame);

		
		driver.switchTo().frame(0);
		
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("edurika");		
		

	}

}
