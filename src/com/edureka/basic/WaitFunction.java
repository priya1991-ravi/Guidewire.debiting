package com.edureka.basic;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class WaitFunction {
  
	static WebDriver driver=null;
	public static void main(String[] argS) {
		
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://www.linkedin.com/login");
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.HOURS);

				
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("priya.1991ravi@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("powerfully1");
		
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		
		WebElement name = driver.findElement(By.xpath("//div[text()='priya ravi']"));
		
		//WebDriverWait wait =  new WebDriverWait(driver,10);
		
		//wait.until(ExpectedConditions.visibilityOf(name));
		name.click();
		

		
	}

}
