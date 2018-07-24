package com.pluralsight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//Print s the list of all the links available on the page whose tagName(“a”)
public class LocatorsTagNameGoogle {
	
	public static void main (String [] args){	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		List <WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Number of links: "+list.size());
		for(int i = 0; i < list.size(); i++){
		System.out.println(list.get(i).getText());
		
		//Partial link name
		driver.findElement(By.partialLinkText("Sign")).click();
		
		//Exact link name
		//driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("abc@abc.com");
		
		
		
		
		}
		
	}

}
