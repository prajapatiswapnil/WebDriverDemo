package com.pluralsight;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;

public class SelectMethod {

	public static void main(String[] args) throws Exception {
		// System.setProperty("webdriver.chrome.driver", "D://Selenium
		// Environment//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.navigate().refresh();

		// Once you got the select object initialised then you can access all the
		// methods of select class.
		// Identify the select HTML element:
		Thread.sleep(10000);
		WebElement mySelectElement = driver.findElement(By.name("dropdown"));
		Select dropdown = new Select(mySelectElement);

		// To select an option - selectByVisibleText, selectByIndex, selectByValue
		// selectByVisibleText
		dropdown.selectByVisibleText("Automation Testing");

		// selectByIndex
		dropdown.selectByIndex(2); // value is QTP

		// selectByValue
		dropdown.selectByValue("ddmanual"); // value is Manual Testing

		// Once you got the select object initialised then you can access all the
		// methods of select class.
		// Identify the select HTML element:
		Thread.sleep(10000);
		WebElement mySelectElementMulti = driver.findElement(By.name("multipleselect[]"));
		Select dropdownMulit = new Select(mySelectElement);

		// To deselect an option
		// the deselect method will throw UnsupportedOperationException if the SELECT
		// does not support multiple selections
		dropdownMulit.selectByVisibleText("Performance Testing");
		Thread.sleep(2000);
		dropdownMulit.deselectByVisibleText("Performance Testing");

		// the deselect method will throw UnsupportedOperationException if the SELECT
		// does not support multiple selections
		dropdownMulit.selectByIndex(2);
		Thread.sleep(2000);
		dropdownMulit.deselectByIndex(2);

		// the deselect method will throw UnsupportedOperationException if the SELECT
		// does not support multiple selections
		dropdownMulit.selectByValue("msagile");
		Thread.sleep(2000);
		dropdownMulit.deselectByValue("msagile");

		// the deselect method will throw UnsupportedOperationException if the SELECT
		// does not support multiple selections
		dropdownMulit.selectByValue("msagile");
		Thread.sleep(2000);
		dropdownMulit.deselectAll();

		// In order to get the selected option
		WebElement option = dropdown.getFirstSelectedOption();
		System.out.println(option.getText()); // output "Selenium"

		// In order to get the list of options from a dropdown
		List<WebElement> optionsPrint = dropdownMulit.getOptions();

		for (WebElement optionsPrint1 : optionsPrint) {
			System.out.println(optionsPrint1.getText());
		}
		// output "Selenium", "QTP", "Manual Testing", "Automation Testing",
		// "Performance Testing"*/

	}
}
