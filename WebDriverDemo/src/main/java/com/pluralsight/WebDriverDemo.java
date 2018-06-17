package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Page Object Model

public class WebDriverDemo {

	public static void main(String[] args) throws Exception {
		
		/*	Step 1 - Download Selenium Standalone Server from https://docs.seleniumhq.org/download/
			Step 2 - Copy JAR file to desired directory or server
			Step 3 - Run below command 
				java -jar selenium-server-standalone-3.12.0.jar -role hub
			Step 4 - Copy below two line from command editor
				Nodes should register to http://192.168.0.101:4444/grid/register/
				Clients should connect to http://192.168.0.101:4444/wd/hub
		
			Step 5 - Open Node URL in browser and it should work
			Step 6 - Run below command on client from the directory where Server JAR is copied. Client also need JAR
					 Port is optional i.e. -port 5555
					 
				java -jar selenium-server-standalone-3.12.0.jar -role node -hub http://192.168.0.101:4444/grid/register/ -port 5555
				
			Step 7 - Refresh Node URL on server and you should see client registered  
			
			Step 8 - Write a test script
				WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub") 
						new DesiredCapabilities("chrome", "", Platform.ANY));

				OR
				
				String URL = "http://www.DemoQA.com";
 				String Node = "http://192.168.1.164:4444/wd/hub";
 				DesiredCapabilities cap = DesiredCapabilities.firefox();
  				driver = new RemoteWebDriver(new URL(Node), cap);
		**/
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		WebElement searchField = driver.findElement(By.id("lst-ib"));
		searchField.sendKeys("pluralsight");
		searchField.submit();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));

		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
		imagesLink.click();

		WebElement imageElement = driver.findElements(By.cssSelector("a[class = rg_l]")).get(0);
		WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
		imageLink.click();
	}
}
