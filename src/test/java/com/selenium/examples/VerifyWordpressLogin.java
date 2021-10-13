package com.selenium.examples;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
	 
	
	public class VerifyWordpressLogin
	{ 
	@Test
	public void verifyValidLogin() throws InterruptedException
	{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("http://opensource-demo.orangehrmlive.com/");
	 
	LoginPage1 login=new LoginPage1(driver);
	login.typeUserName("Admin");
	Thread.sleep(3000);
	 login.typePassword("admin123");
	 Thread.sleep(3000);
	login.clickOnloginButton();
	 driver.quit();
	 
	}
	 
	}


