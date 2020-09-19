package com.edureka.testng;

import org.testng.annotations.Test;

public class ActTime {
	
	@Test(priority=2)
	public void create_user() {
		System.out.println("user is created successfully");
	}
	
	@Test(priority=1)
	public void delete_user() {
		System.out.println("user is deleted successfully");
	}
	
	@Test(invocationCount=5 , priority=3)
	public void edit_user() {
		System.out.println("user is edited successfully");
	}

}
