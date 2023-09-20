package com.qa.test;

import org.testng.annotations.Test;

public class Testcase1 extends BaseTest{
	
	@Test
	public void loginTest() {
		
		
		driver.get("https://facebook.com");
		String title=driver.getTitle();
		System.out.println("Facebook homepage title name"+title);
		
}
	
}
