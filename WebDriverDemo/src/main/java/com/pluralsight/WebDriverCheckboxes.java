package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckboxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Java/STS_Workspace/WebDriverDemo/source/main/webapp/CheckboxTest.html");
		
		WebElement checkbox = driver.findElement(By.id("lettuceCheckbox"));
		String s = checkbox.getText();
		System.out.println("getText " + s);
		
		s = checkbox.getTagName();
		System.out.println("getTagName " + s);
		
		s = checkbox.getAttribute("value");
		System.out.println("getAttribute - value -> " + s);
		
		s = checkbox.getAttribute("innerText");
		System.out.println("getAttribute - value -> " + s);
		///html/body/form/text()[3]
		

		checkbox.click();
		//checkbox.click();

	}

}
