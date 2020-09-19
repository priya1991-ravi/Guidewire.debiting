package com.edureka.basic;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.handler.ContextHandlerCollection;


public class SelectOption {
	

	static WebDriver driver =  null;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 //driver.get("http://www.appointinfo.com/enquiry-form-10009.htm");
	
		 //driver.get("http://output.jsbin.com/osebed/2");
		 
		 driver.get("http://demo.guru99.com/test/drag_drop.html");
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	
		//WebElement  country = driver.findElement(By.xpath("//select[@name='dynFrm_country']"));
	   //Select sel =  new Select(country);
	  //sel.selectByValue("IN^91");
	
  
	     /*        if( sel.isMultiple()) {
	            	
	            	System.out.print("multiple");
	            }
	            
	            else {
	            	System.out.print("single");
	            }*/
		//WebElement  fruits  = driver.findElement(By.xpath("//select[@id='fruits']"));
		   //Select sel =  new Select(fruits); 
		 //  sel.selectByValue("banana");
		//   sel.selectByValue("orange");
	
		   
		  
		
	          /*  List<WebElement> alloption = sel.getOptions();
	             int count =alloption.size();
	             System.out.print(count);
				
	             for(int i=0 ;i<count;i++)
	             {
	            	 
	            	 sel.selectByIndex(i);
	            	 
	             }
	             for(int i=0 ;i<count;i++)
	             {
	            	 
	            	 sel.deselectByIndex(i);
	            	 
	             }*/
		 
	        /* List<WebElement> allselect = sel.getAllSelectedOptions();
		   
	         
	         for(WebElement option : allselect) {
	          System.out.print(option.getText());
	         }*/
		   
		/*   List<WebElement> alloption = sel.getOptions();
		   
		 ArrayList<String> al= new ArrayList<String>();
		 
		 for(WebElement option :alloption ) {
			 
			 String text = option.getText();
			 al.add(text);
			 
		 }
		 
        Collections.sort(al);
        
        for(String text:al)
        {
        	System.out.print(text);
        }*/
		
		WebElement web = driver.findElement(By.xpath("//li[@id='credit2']/a"));
		WebElement web1 = driver.findElement(By.xpath("//ol[@id='bank']/li"));
	 Actions act = new Actions(driver);
	 act.dragAndDrop(web, web1).build().perform();

		
}
}