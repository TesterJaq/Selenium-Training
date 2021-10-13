package com.selenium.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;

public class AlertDemo {
	WebDriver wd;
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		wd= new ChromeDriver();
		}
	
	
	@SuppressWarnings("null")
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
		
	
        
        // Alert Message handling
                    		
        WebDriver driver = null;
		driver.get("http://demo.guru99.com/test/delete_customer.php");			
                            		
     	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		
    }	

}