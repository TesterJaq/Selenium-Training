package com.selenium.examples;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginExample {

//public static void main(String[] args) throws InterruptedException  {
	@Test
	public void logintest() throws InterruptedException {
		
WebDriverManager.firefoxdriver().setup();
WebDriver driver = new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
		Thread.sleep(3000);
		

WebElement username= driver.findElement(By.name ("txtUsername"));

		username.sendKeys ("Admin");
		
		Thread.sleep(3000);

WebElement password=driver.findElement(By.name("txtPassword"));

		password.sendKeys ("admin123");

		Thread.sleep(3000);
WebElement login  = driver. findElement(By.name ("Submit"));

		login.click();

		Thread.sleep(3000);

		driver.quit();
	}



	}


