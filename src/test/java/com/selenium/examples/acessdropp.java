package com.selenium.examples;


		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.support.ui.Select;
        import org.testng.annotations.Test;

        import io.github.bonigarcia.wdm.WebDriverManager;

        import org.openqa.selenium.By;

		public class acessdropp {
		// public static void main(String[] args)  
		 
			 @Test
				public void logintest() throws InterruptedException {
					
			WebDriverManager.firefoxdriver().setup();
			@SuppressWarnings("unused")
			WebDriver driver = new FirefoxDriver();
			@SuppressWarnings("unused")
			String baseURL = "http://demo.guru99.com/test/newtours/register.php";		
			    WebDriver driver1 = new FirefoxDriver();
				String baseURL1 = null;
				
		
				driver1.get(baseURL1);

				Select drpCountry = new Select(driver1.findElement(By.name("country")));
				drpCountry.selectByVisibleText("ANTARCTICA");

				//Selecting Items in a Multiple SELECT elements
				driver1.get("http://jsbin.com/osebed/2");
				Select fruits = new Select(driver1.findElement(By.id("fruits")));
				fruits.selectByVisibleText("Banana");
				fruits.selectByIndex(1);
		 }
		

	
		 
}
