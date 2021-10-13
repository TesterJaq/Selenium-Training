package com.selenium.examples;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
		/**
	
	* This class will store all the locator and methods of login page
	*
	*/
	public class LoginPage1{ 
	WebDriver driver;
	By username=By.xpath("//Input[@name='txtUsername']");
	By password=By.cssSelector("#txtPassword");
	By loginButton=By.cssSelector("input[class='button']");
	 
	 
	public LoginPage1(WebDriver driver)
	{
	this.driver=driver;
	}
	 
	 
	public void loginToWordpress(String userid,String pass)
	{
	 
	driver.findElement(username).sendKeys(userid);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(loginButton).click();
	 
	}
	 
	 
	public void typeUserName(String uid)
	{
	 
	driver.findElement(username).sendKeys(uid);
	}
	 
	public void typePassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void clickOnloginButton() {
		
	
	driver.findElement(loginButton).click();
	}}
