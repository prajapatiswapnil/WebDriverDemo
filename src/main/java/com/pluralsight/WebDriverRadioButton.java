package com.pluralsight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRadioButton {

	public static void main(String[] args) {
		WebDriver cDriver = new ChromeDriver();
		cDriver.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");

		List<WebElement> radioSoftwareProduct = cDriver.findElements(By.name("software"));
		radioSoftwareProduct.get(1).click();

		List<WebElement> radioSoftwareLevel = cDriver.findElements(By.name("level"));
		radioSoftwareLevel.get(0).click();

		for (WebElement radioSoftwareProducts : radioSoftwareProduct) {
			if (radioSoftwareProducts.isSelected()) {
				System.out.println(radioSoftwareProducts.getAttribute("value"));
				//System.out.println(radioSoftwareProducts.getAttribute("outerHTML"));
				//System.out.println(radioSoftwareProducts.getAttribute("innerHTML"));
				//System.out.println(radioSoftwareProducts.getTagName());
				//System.out.println(radioSoftwareProducts.getText());
				
				String contents = (String)((JavascriptExecutor)cDriver).executeScript("return      arguments[0].innerText;", radioSoftwareProducts);
				System.out.println(contents);
			}

		}
	}

}
