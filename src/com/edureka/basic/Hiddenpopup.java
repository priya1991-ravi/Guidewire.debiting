package com.edureka.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenpopup {

	static WebDriver driver =  null;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\selenium workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		driver =  new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		driver.get("https://www.cleartrip.com/flights?dxid=CjwKCAjwxt_tBRAXEiwAENY8hcKj9AbZaUdiQtHXWeRxl-5ALerx1DVxRR3DHuxLOoZkhR78akPiwBoCTnQQAvD_BwE&gclid=CjwKCAjwxt_tBRAXEiwAENY8hcKj9AbZaUdiQtHXWeRxl-5ALerx1DVxRR3DHuxLOoZkhR78akPiwBoCTnQQAvD_BwE");
		
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		
		driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();
	
		//driver.findElement(By.xpath("//a[text()='30'][1]")).click();
		
	
	}

}
