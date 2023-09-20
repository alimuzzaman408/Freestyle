package com.qa.test;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    WebDriver driver;
	@Parameters({"browser","platform"})
	@BeforeMethod
	public void setup(String browsername,String platformname,Method name) throws MalformedURLException {
		String methodname=name.getName();
		MutableCapabilities mc=new 	MutableCapabilities();
		mc.setCapability("name",methodname);
		mc.setCapability("build", "selenium-build-LV61U");
		mc.setCapability("SeleniumVersion", "4.11.0");
		mc.setCapability("username", "oauth-mazaman6994-a55e3");
		mc.setCapability("accessKey", "e080cfb7-a430-406a-9f2e-e79232339a0e");
		mc.setCapability("tags", "java-w3-examples");

		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setCapability("sauce:options", mc);
		cp.setCapability("browserVersion", "latest");
		cp.setCapability("platformName", platformname);

		if(browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			cp.setCapability("browserName", "chrome");
		}
		else if(browsername.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			cp.setCapability("browserName", "firefox");
		}
		else if(browsername.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			cp.setCapability("browserName", "edge");
		}

		URL url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, cp);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));

	}

	@AfterMethod()
	
	public void teardown() {
		driver.quit();
	}

}
