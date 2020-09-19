package com.edureka.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {
  static WebDriver driver =  null;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\selenium workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		driver =  new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		WebElement cust_id = driver.findElement(By.xpath("//input[@type='text']"));
		cust_id.sendKeys("53921");
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
	}

}
