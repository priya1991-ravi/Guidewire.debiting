package com.edureka.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.annotations.DataProviderAnnotation;



public class Parametersclass {
	  WebDriver driver= null;
		
	@BeforeMethod  
	public void preCondition() {
		System.setProperty("webdriver.chrome.driver","E:\\selenium workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://online.actitime.com/wns/login.do");
	
	}
	
	@Parameters({"uname","pass"})
	@Test
	public void login(String uname , String pass) {
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
}
