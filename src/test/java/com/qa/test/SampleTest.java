package com.qa.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SampleTest {
	
	WebDriver driver;
	@Parameters("Browser")
	@Test
	public void test13(String browsername) {
		
		if(browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			
		}else if(browsername.equals("edge")) {
			WebDriverManager.edgedriver().setup();
		    driver=new EdgeDriver();
			
		}else if(browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			
		}
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
//		List<WebElement>list=driver.findElements(By.xpath("//table[@class='dataTable']//td"));
//	    Thread.sleep(5000);
//	    
//	    boolean flag=false;
//	    for(WebElement element:list) {
//	    	if(element.getText().contains("jhon")) {
//	    		flag=true;
//	    		break;
//	    		
//	    	}
//	    	
//	    	}
//	    	Assert.assertTrue("Element not found", flag);
//	    	
//	    	System.out.println("Test is completed");
	    	
	    	driver.quit();
	    	
	    }
	    
	
	}

