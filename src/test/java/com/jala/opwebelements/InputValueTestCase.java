package com.jala.opwebelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputValueTestCase {

	public static void main(String[] args) {

		String pathDriver = System.getProperty("user.dir");

		// System.out.println("PathDtiver: "+ pathDriver);
		// System.setProperty("webdriver.gecko.driver",
		// pathDriver+"\\drivers\\gecko\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", pathDriver + "\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement inputUserElement =driver.findElement(By.id("UserName"));
		inputUserElement.sendKeys("Selenium");
		String value = inputUserElement.getAttribute("value");
		System.out.println("Entered text is: " + value);
		
		WebElement inputPasswordElement =driver.findElement(By.id("Password"));
		inputPasswordElement.sendKeys("Selenium@12345");
		String value1 = inputPasswordElement.getAttribute("value");
		System.out.println("Entered text is: " + value1);
	    //driver.close();
	}

}
