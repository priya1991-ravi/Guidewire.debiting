package com.edureka.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleWebPage {
	
	static WebDriver driver  =  null;
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium workspace\\SeleniumProject\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		
	String expected_title="Google";
		
		if(title.equals(expected_title)) {
			
			System.out.println("pass");
		}
		else {
			System.out.println(title +"failed");
		}
	}

}
