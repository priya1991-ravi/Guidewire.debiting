package com.edureka.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotaiontestng {
	
	@BeforeSuite
	public void BeforeSuiteMethod() {
		System.out.println("this gets executed before the execution of project");
		
		}
	@AfterSuite
	public void AfterSuiteMethod() {
		System.out.println("this gets executed after the execution of project");
		
		}
	
	@BeforeTest
	public void BeforeTestMethod() {
		System.out.println("this gets executed before every test block in testng.xml file");
		
		}
	@AfterTest
	public void AfterTestMethod() {
		System.out.println("this gets executed after every test block in testng.xml file");
		
		}
    @BeforeClass
	public void BeforeClassMethod() {
		System.out.println("this gets executed before test block in testng.xml file");
		
		}
    @AfterClass
	public void AfterClassMethod() {
		System.out.println("this gets executed after test block in testng.xml file");
		
		}
	@BeforeMethod
	public void beforeMethod() {
     System.out.println("this gets executed before every test  method in the class");
		
		}
	@AfterMethod
	public void afterMethod() {
		System.out.println("this gets executed after every test  method in the class");
		
		}
    @Test
	public void TestMethod() {
		System.out.println("this is the main script to be executed");
		
		}

}
