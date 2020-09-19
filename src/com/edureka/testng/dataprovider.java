package com.edureka.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	WebDriver driver= null;
	
	@DataProvider
  public Object[][] getdata(){
	  
	  
	  Object[][] credential =  new Object[1][2];
	  credential[0][0]= "priya.1991ravi@gmail.com";
	  credential[0][1]= "paGELU5A";
	   
	  return credential;
  }
	
	
		@BeforeMethod  
		public void preCondition() {
			System.setProperty("webdriver.chrome.driver","E:\\selenium workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://online.actitime.com/wns/login.do");
		
		}
		
		
		@Test(dataProvider="getdata")
		public void login(String uname , String pass) {
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
		}
	}


