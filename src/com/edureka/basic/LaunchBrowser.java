package com.edureka.basic;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class LaunchBrowser{

	public static WebDriver driver = null;
	
	public static void main(String[] args) {
      
	System.setProperty("webdriver.chrome.driver","E:\\selenium workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
		
			
			//WebElement email = driver.findElement(By.id("email"));
			
			//WebElement email = driver.findElement(By.name("email"));

			WebElement email = driver.findElement(By.cssSelector("#email"));
	
	         email.sendKeys("priya.1991ravi@gmail.com");
			
			//WebElement forgotpassword = driver.findElement(By.linkText("Forgotten account?"));
			
	WebElement forgotpassword = driver.findElement(By.cssSelector(".login_form_label_field"));
			
	           forgotpassword.click();
			

			driver.close();
	}}